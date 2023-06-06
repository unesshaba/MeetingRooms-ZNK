package com.meetingplanner;

import com.meetingplanner.entities.Equipment;
import com.meetingplanner.entities.Reservation;
import com.meetingplanner.entities.Salle;
import com.meetingplanner.entities.TypeReservation;
import com.meetingplanner.repositories.EquipmentRepository;
import com.meetingplanner.repositories.ReservationRepository;
import com.meetingplanner.repositories.SalleRepository;
import com.meetingplanner.repositories.TypeReservationRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class MeetingPlannerApplication {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(MeetingPlannerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(SalleRepository salleRepository,
                                        EquipmentRepository equipmentRepository,
                                        TypeReservationRepository typeReservationRepository,
                                        ReservationRepository reservationRepository){



        return args ->{


            //===================Add salle
//            // salle 11
            Salle salle11 = new Salle();
            salle11.setName("E1001");
            salle11.setCapaciter(23);
            Salle salle1 = salleRepository.save(salle11);
            // salle 12
            Salle salle12 = new Salle();
            salle12.setName("E1002");
            salle12.setCapaciter(10);
            Salle salle2 = salleRepository.save(salle12);
            //salle 13
            Salle salle13 = new Salle();
            salle13.setName("E1003");
            salle13.setCapaciter(8);
            Salle salle3 = salleRepository.save(salle13);
            //salle 14
            Salle salle14 = new Salle();
            salle14.setName("E1004");
            salle14.setCapaciter(4);
            Salle salle4 = salleRepository.save(salle14);
            //salle 4
            Salle salle21 = new Salle();
            salle21.setName("E2001");
            salle21.setCapaciter(4);
            Salle salle5 = salleRepository.save(salle21);
            //salle 22
            Salle salle22 = new Salle();
            salle22.setName("E2002");
            salle22.setCapaciter(15);
            Salle salle6 = salleRepository.save(salle22);
            //salle 23
            Salle salle23 = new Salle();
            salle23.setName("E2003");
            salle23.setCapaciter(7);
            Salle salle7 = salleRepository.save(salle23);
            //salle 24
            Salle salle24 = new Salle();
            salle24.setName("E2004");
            salle24.setCapaciter(9);
            Salle salle8 = salleRepository.save(salle24);
            //salle 31
            Salle salle31 = new Salle();
            salle31.setName("E3001");
            salle31.setCapaciter(13);
            Salle salle9 = salleRepository.save(salle31);
            //salle 32
            Salle salle32 = new Salle();
            salle32.setName("E3002");
            salle32.setCapaciter(8);
            Salle sal10 = salleRepository.save(salle32);
            //salle 33
            Salle salle33 = new Salle();
            salle33.setName("E3003");
            salle33.setCapaciter(9);
            Salle sal11 = salleRepository.save(salle33);
            //salle 34
            Salle salle34 = new Salle();
            salle34.setName("E3004");
            salle34.setCapaciter(4);
            Salle sal12 = salleRepository.save(salle34);

            // Réunion 1
            Reservation reservation1 = new Reservation();
            reservation1.setName("Reunion 1");
            reservation1.setStartTime(new Date(2023,Calendar.JUNE,5,9,0));
            reservation1.setEndTime(new Date(2023, Calendar.JUNE,5,10,0));
            reservation1.setNumberOfAttendees(8);
            Reservation res1 = reservationRepository.save(reservation1);
            // Réunion 2
            Reservation reservation2 = new Reservation();
            reservation2.setName("Reunion 2");
            reservation2.setStartTime(new Date(2023,Calendar.JUNE,5,9,0));
            reservation2.setEndTime(new Date(2023, Calendar.JUNE,5,10,0));
            reservation2.setNumberOfAttendees(6);
            Reservation res2 = reservationRepository.save(reservation2);
            // Réunion 3
            Reservation reservation3 = new Reservation();
            reservation3.setName("Reunion 3");
            reservation3.setStartTime(new Date(2023,Calendar.JUNE,5,11,0));
            reservation3.setEndTime(new Date(2023, Calendar.JUNE,5,12,0));
            reservation3.setNumberOfAttendees(4);
            Reservation res3 = reservationRepository.save(reservation3);
            // Réunion 4
            Reservation reservation4 = new Reservation();
            reservation4.setName("Reunion 4");
            reservation4.setStartTime(new Date(2023,Calendar.JUNE,5,11,0));
            reservation4.setEndTime(new Date(2023, Calendar.JUNE,5,12,0));
            reservation4.setNumberOfAttendees(2);
            Reservation res4 = reservationRepository.save(reservation4);
            // Réunion 5
            Reservation reservation5 = new Reservation();
            reservation5.setName("Reunion 5");
            reservation5.setStartTime(new Date(2023,Calendar.JUNE,5,11,0));
            reservation5.setEndTime(new Date(2023, Calendar.JUNE,5,12,0));
            reservation5.setNumberOfAttendees(9);
            Reservation res5 = reservationRepository.save(reservation5);
            // Réunion 6
            Reservation reservation6 = new Reservation();
            reservation6.setName("Reunion 6");
            reservation6.setStartTime(new Date(2023,Calendar.JUNE,5,9,0));
            reservation6.setEndTime(new Date(2023, Calendar.JUNE,5,10,0));
            reservation6.setNumberOfAttendees(7);
            Reservation res6 = reservationRepository.save(reservation6);
            // Réunion 7
            Reservation reservation7 = new Reservation();
            reservation7.setName("Reunion 7");
            reservation7.setStartTime(new Date(2023,Calendar.JUNE,5,8,0));
            reservation7.setEndTime(new Date(2023, Calendar.JUNE,5,9,0));
            reservation7.setNumberOfAttendees(9);
            Reservation res7 = reservationRepository.save(reservation7);
            // Réunion 8
            Reservation reservation8 = new Reservation();
            reservation8.setName("Reunion 8");
            reservation8.setStartTime(new Date(2023,Calendar.JUNE,5,8,0));
            reservation8.setEndTime(new Date(2023, Calendar.JUNE,5,9,0));
            reservation8.setNumberOfAttendees(10);
            Reservation res8 = reservationRepository.save(reservation8);
// Réunion 9
            Reservation reservation9 = new Reservation();
            reservation9.setName("Reunion 9");
            reservation9.setStartTime(new Date(2023,Calendar.JUNE,5,9,0));
            reservation9.setEndTime(new Date(2023, Calendar.JUNE,5,10,0));
            reservation9.setNumberOfAttendees(5);
            Reservation res9 = reservationRepository.save(reservation9);
// Réunion 10
            Reservation reservation10 = new Reservation();
            reservation10.setName("Reunion 10");
            reservation10.setStartTime(new Date(2023,Calendar.JUNE,5,9,0));
            reservation10.setEndTime(new Date(2023, Calendar.JUNE,5,10,0));
            reservation10.setNumberOfAttendees(4);
            Reservation res10 = reservationRepository.save(reservation10);
// Réunion 11
            Reservation reservation11 = new Reservation();
            reservation11.setName("Reunion 11");
            reservation11.setStartTime(new Date(2023,Calendar.JUNE,5,9,0));
            reservation11.setEndTime(new Date(2023, Calendar.JUNE,5,10,0));
            reservation11.setNumberOfAttendees(8);
            Reservation res11 = reservationRepository.save(reservation11);
// Réunion 12
            Reservation reservation12 = new Reservation();
            reservation12.setName("Reunion 12");
            reservation12.setStartTime(new Date(2023,Calendar.JUNE,5,11,0));
            reservation12.setEndTime(new Date(2023, Calendar.JUNE,5,12,0));
            reservation12.setNumberOfAttendees(12);
            Reservation res12 = reservationRepository.save(reservation12);
// Réunion 13
            Reservation reservation13 = new Reservation();
            reservation13.setName("Reunion 13");
            reservation13.setStartTime(new Date(2023,Calendar.JUNE,5,11,0));
            reservation13.setEndTime(new Date(2023, Calendar.JUNE,5,12,0));
            reservation13.setNumberOfAttendees(5);
            Reservation res13 = reservationRepository.save(reservation13);
// Réunion 14
            Reservation reservation14 = new Reservation();
            reservation14.setName("Reunion 14");
            reservation14.setStartTime(new Date(2023,Calendar.JUNE,5,8,0));
            reservation14.setEndTime(new Date(2023, Calendar.JUNE,5,9,0));
            reservation14.setNumberOfAttendees(3);
            Reservation res14 = reservationRepository.save(reservation14);
// Réunion 15
            Reservation reservation15 = new Reservation();
            reservation15.setName("Reunion 15");
            reservation15.setStartTime(new Date(2023,Calendar.JUNE,5,8,0));
            reservation15.setEndTime(new Date(2023, Calendar.JUNE,5,9,0));
            reservation15.setNumberOfAttendees(2);
            Reservation res15 = reservationRepository.save(reservation15);
// Réunion 16
            Reservation reservation16 = new Reservation();
            reservation16.setName("Reunion 16");
            reservation16.setStartTime(new Date(2023,Calendar.JUNE,5,8,0));
            reservation16.setEndTime(new Date(2023, Calendar.JUNE,5,9,0));
            reservation16.setNumberOfAttendees(12);
            Reservation res16 = reservationRepository.save(reservation16);
// Réunion 17
            Reservation reservation17 = new Reservation();
            reservation17.setName("Reunion 17");
            reservation17.setStartTime(new Date(2023,Calendar.JUNE,5,10,0));
            reservation17.setEndTime(new Date(2023, Calendar.JUNE,5,11,0));
            reservation17.setNumberOfAttendees(6);
            Reservation res17 = reservationRepository.save(reservation17);
// Réunion 18
            Reservation reservation18 = new Reservation();
            reservation18.setName("Reunion 18");
            reservation18.setStartTime(new Date(2023,Calendar.JUNE,5,11,0));
            reservation18.setEndTime(new Date(2023, Calendar.JUNE,5,12,0));
            reservation18.setNumberOfAttendees(2);
            Reservation res18 = reservationRepository.save(reservation18);
// Réunion 19
            Reservation reservation19 = new Reservation();
            reservation19.setName("Reunion 19");
            reservation19.setStartTime(new Date(2023,Calendar.JUNE,5,9,0));
            reservation19.setEndTime(new Date(2023, Calendar.JUNE,5,10,0));
            reservation19.setNumberOfAttendees(4);
            Reservation res19 = reservationRepository.save(reservation19);
// Réunion 20
            Reservation reservation20 = new Reservation();
            reservation20.setName("Reunion 20");
            reservation20.setStartTime(new Date(2023,Calendar.JUNE,5,9,0));
            reservation20.setEndTime(new Date(2023, Calendar.JUNE,5,10,0));
            reservation20.setNumberOfAttendees(7);
            Reservation res20 = reservationRepository.save(reservation20);



//            List<Equipment> equipment = new ArrayList<>();
            TypeReservation typeReservation = new TypeReservation(); // ecran pieuvre webcam
            typeReservation.setNom("VC");
            TypeReservation VC = typeReservationRepository.save(typeReservation);
//            // type 2
            TypeReservation typeReservation1 = new TypeReservation(); // tableau ecran pieuvre
            typeReservation.setNom("RC");
            TypeReservation RC = typeReservationRepository.save(typeReservation1);
//            // type 3
            TypeReservation typeReservation2 = new TypeReservation(); // tableau
            typeReservation2.setNom("SPEC");
            TypeReservation SPEC = typeReservationRepository.save(typeReservation2);
            // type 4
            TypeReservation typeReservation3 = new TypeReservation(); // capaciter > 3 places
            typeReservation3.setNom("RS");
            TypeReservation RS = typeReservationRepository.save(typeReservation3);
//            //=================== Add Equipement
            Equipment equipment1 = new Equipment();
            equipment1.setNom("Neant");
            Equipment ep1 = equipmentRepository.save(equipment1);

//            // equipment 2
            Equipment equipment2 = new Equipment();
            equipment2.setNom("Ecran");
            Equipment ep2 = equipmentRepository.save(equipment2);

//            // equipment 3
            Equipment equipment3 = new Equipment();
            equipment3.setNom("Pieuvre");
            Equipment ep3 = equipmentRepository.save(equipment3);

            // equipment 4
            Equipment equipment4 = new Equipment();
            equipment4.setNom("Tableau");
            Equipment ep4 = equipmentRepository.save(equipment4);

            // equipment 5
            Equipment equipment5 = new Equipment();
            equipment5.setNom("Webcam");
            Equipment ep5 = equipmentRepository.save(equipment5);


            VC.getEquipment().add(ep1);
            RC.getEquipment().add(ep1);
            SPEC.getEquipment().add(ep1);
            RS.getEquipment().add(ep1);
            ep1.getTypeReservations().add(VC);
            ep1.getTypeReservations().add(RC);
            ep1.getTypeReservations().add(SPEC);
            ep1.getTypeReservations().add(RS);
            VC.getEquipment().add(ep2);
            RC.getEquipment().add(ep2);
            ep2.getTypeReservations().add(VC);
            ep2.getTypeReservations().add(RC);
            VC.getEquipment().add(ep3);
            RC.getEquipment().add(ep3);
            ep3.getTypeReservations().add(VC);
            ep3.getTypeReservations().add(RC);
            RC.getEquipment().add(ep4);
            SPEC.getEquipment().add(ep4);
            ep4.getTypeReservations().add(RC);
            ep4.getTypeReservations().add(SPEC);
            VC.getEquipment().add(ep5);
            ep5.getTypeReservations().add(VC);

            equipmentRepository.save(ep1);
            equipmentRepository.save(ep2);
            equipmentRepository.save(ep3);
            equipmentRepository.save(ep4);
            equipmentRepository.save(ep5);

            typeReservationRepository.save(VC);
            typeReservationRepository.save(RC);
            typeReservationRepository.save(SPEC);
            typeReservationRepository.save(RS);
//
            salle1.getEquipment().add(ep1);
            salle2.getEquipment().add(ep2);
            salle3.getEquipment().add(ep3);
            salle4.getEquipment().add(ep4);
            salle5.getEquipment().add(ep1);
            salle6.getEquipment().add(ep2);
            salle6.getEquipment().add(ep5);
            salle7.getEquipment().add(ep1);
            salle8.getEquipment().add(ep4);
            salle9.getEquipment().add(ep2);
            salle9.getEquipment().add(ep3);
            salle9.getEquipment().add(ep5);
            sal10.getEquipment().add(ep1);
            sal11.getEquipment().add(ep2);
            sal11.getEquipment().add(ep3);
            sal12.getEquipment().add(ep1);
            salleRepository.save(salle1);
            salleRepository.save(salle2);
            salleRepository.save(salle3);
            salleRepository.save(salle4);
            salleRepository.save(salle5);
            salleRepository.save(salle6);
            salleRepository.save(salle7);
            salleRepository.save(salle8);
            salleRepository.save(salle9);
            salleRepository.save(sal10);
            salleRepository.save(sal11);
            salleRepository.save(sal12);
//
            List<Salle> salles = new ArrayList<>();
            res1.setSalle(salle1);
            res1.setTypeReservation(VC);
            reservationRepository.save(res1);

            res2.setSalle(salle3);
            res2.setTypeReservation(VC);
            reservationRepository.save(res2);

            res3.setSalle(salle2);
            res3.setTypeReservation(RC);
            reservationRepository.save(res3);

            res4.setSalle(salle4);
            res4.setTypeReservation(RS);
            reservationRepository.save(res4);

            res5.setSalle(salle6);
            res5.setTypeReservation(SPEC);
            reservationRepository.save(res5);

            res6.setSalle(salle1);
            res6.setTypeReservation(RC);
            reservationRepository.save(res6);

            res7.setSalle(salle3);
            res7.setTypeReservation(VC);
            reservationRepository.save(res7);

            res8.setSalle(salle4);
            res8.setTypeReservation(SPEC);
            reservationRepository.save(res8);

            res9.setSalle(salle4);
            res9.setTypeReservation(SPEC);
            reservationRepository.save(res9);

            res10.setSalle(salle8);
            res10.setTypeReservation(RS);
            reservationRepository.save(res10);

            res11.setSalle(sal11);
            res11.setTypeReservation(typeReservation1);
            reservationRepository.save(res11);


            res12.setSalle(salle3);
            res12.setTypeReservation(VC);
            reservationRepository.save(res12);

            res13.setSalle(salle2);
            res13.setTypeReservation(SPEC);
            reservationRepository.save(res13);

            res14.setSalle(salle7);
            res14.setTypeReservation(VC);
            reservationRepository.save(res14);

            res15.setSalle(salle8);
            res15.setTypeReservation(SPEC);
            reservationRepository.save(res15);

            res16.setSalle(salle5);
            res16.setTypeReservation(VC);
            reservationRepository.save(res16);

            res17.setSalle(salle6);
            res17.setTypeReservation(VC);
            reservationRepository.save(res17);

            res18.setSalle(salle9);
            res18.setTypeReservation(RS);
            reservationRepository.save(res18);

            res19.setSalle(salle6);
            res19.setTypeReservation(RS);
            reservationRepository.save(res19);

            res20.setSalle(salle1);
            res20.setTypeReservation(RC);
            reservationRepository.save(res20);


            Reservation reservation21 = new Reservation();
            reservation21.setName("re2");
            reservation21.setStartTime(new Date(2023,Calendar.MAY,24,10,0));
            reservation21.setEndTime(new Date(2023, Calendar.MAY,24,11,0));

            salles.add(salleRepository.save(salle11));
            salles.add(salleRepository.save(salle12));
            salles.add(salleRepository.save(salle13));
            salles.add(salleRepository.save(salle14));
            salles.add(salleRepository.save(salle21));
            salles.add(salleRepository.save(salle22));
            salles.add(salleRepository.save(salle23));
            salles.add(salleRepository.save(salle24));
            salles.add(salleRepository.save(salle31));
            salles.add(salleRepository.save(salle32));
            salles.add(salleRepository.save(salle33));
            salles.add(salleRepository.save(salle34));

            reservation21.setTypeReservation(typeReservationRepository.save(typeReservation));
            reservation21.setTypeReservation(typeReservationRepository.save(typeReservation));
            reservation21.setSalle(salle1);
            reservation21.setSalle(salle2);
            salle2.getReservations().add(reservation21);
            salle1.getReservations().add(reservation21);
            salleRepository.save(salle2);
            salleRepository.save(salle1);


        };
    }

}
