package com.meetingplanner.services;


import com.meetingplanner.Exceptions.EquipmentNotFoundException;
import com.meetingplanner.Exceptions.TypeNotFoundException;
import com.meetingplanner.dto.SalleDto;
import com.meetingplanner.entities.Equipment;
import com.meetingplanner.entities.Reservation;
import com.meetingplanner.entities.Salle;
import com.meetingplanner.entities.TypeReservation;
import com.meetingplanner.repositories.EquipmentRepository;
import com.meetingplanner.repositories.SalleRepository;
import com.meetingplanner.repositories.ReservationRepository;
import com.meetingplanner.repositories.TypeReservationRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.*;
import java.util.stream.Collectors;

@Service @AllArgsConstructor
public class SalleServices implements ISalleServices{
    private SalleRepository salleRepository;
    private ModelMapper mapper;
    private ReservationRepository reservationRepository;
    private EquipmentRepository equipmentRepository;
    private TypeReservationRepository typeReservationRepository;

    @Override
    public List<Salle> filterByCapaciter(List<Salle> salles, int capaciter) {
        List<Salle> s = salles.stream().filter(s1 -> s1.getCapacityInCovid() >= capaciter).toList();
        System.out.println("/**************** after");
        System.out.println(s);
       return s;
    }


    @Override
    public List<Salle> filterByEquipment(List<Salle> salles, List<Long> equipmentid){
        List<Equipment> equipment = new ArrayList<>();
        for (Long id : equipmentid){
            Optional<Equipment> eq = equipmentRepository.findById(id);
            if (eq.isPresent()){
                equipment.add(eq.get());
            }
            else {
                try {
                    throw new EquipmentNotFoundException("le type que vous avez entrer n'exist pas !!!");
                } catch (EquipmentNotFoundException e) {
                   // throw new RuntimeException(e);
                    e.printStackTrace();
                }
            }

        }
        List<Salle> s = salleRepository.findSallesByEq(equipment,equipment.size());

        return salles.stream()
                .filter(s::contains)
                .collect(Collectors.toList());
    }


    @Override
    public List<Salle> filterByTypeDeReunion(List<Salle> salles, Long typeReservations){
        Optional<TypeReservation> t = typeReservationRepository.findById(typeReservations);
        if (t.isPresent()){
           salles = filterByEquipment(salles,t.get().getEquipment().stream().map(Equipment::getId).collect(Collectors.toList()));
        }
        else {
            //throw ex
            try {
                throw new TypeNotFoundException("le type que vous avez entrer n'exist pas !!!");
            } catch (TypeNotFoundException e) {
               // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
return  salles;
//        return salles.stream()
//                .filter(salle -> salle.getEquipment().stream()
//                        .flatMap(equipment -> equipment.getTypeReservations().stream())
//                        .anyMatch(typeReservations::contains))
//                .collect(Collectors.toList());
    }

    @Override
    public List<SalleDto> filterSalles (Date start, Date end, int capaciter, List<Long> equipment, Long typeReservations){

//        LocalDateTime localDate = LocalDateTime
//                .ofInstant(start.toInstant(), ZoneId.systemDefault()).minusHours(1);
//        start = Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(start);
        List<Reservation> rev = reservationRepository.findByStartTimeGreaterThanEqualAndEndTimeLessThanEqual(start,end);
        System.out.println(rev);
        List<Salle> salle = new ArrayList<>();
        if (rev.isEmpty()){
            salle=salleRepository.findAll();
        }else{
            salleRepository.findSallesByReservationsNotInOrReservationsIsNull(rev);
        }

        System.out.println(salle);
        if (capaciter!=0){
            salle = filterByCapaciter(salle, capaciter);
        }
        if (equipment!=null){
            salle = filterByEquipment(salle,equipment);
        }
        if (typeReservations!=null){
            salle = filterByTypeDeReunion(salle,typeReservations);
        }



        return  salle.stream().map(salle1 -> mapper.map(salle1, SalleDto.class)).collect(Collectors.toList());

    }



}
