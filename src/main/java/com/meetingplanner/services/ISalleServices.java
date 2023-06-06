package com.meetingplanner.services;

import com.meetingplanner.Exceptions.EquipmentNotFoundException;
import com.meetingplanner.Exceptions.TypeNotFoundException;
import com.meetingplanner.dto.SalleDto;
import com.meetingplanner.entities.Salle;



import java.util.*;

public interface ISalleServices {
    List<Salle> filterByCapaciter(List<Salle> salles,int capaciter);

    List<Salle> filterByEquipment(List<Salle> salles,  List<Long> equipmentid) throws EquipmentNotFoundException;

    List<Salle> filterByTypeDeReunion(List<Salle> salles, Long typeReservations) throws TypeNotFoundException, EquipmentNotFoundException;

    List<SalleDto> filterSalles(Date start, Date end,int capaciter, List<Long> equipment, Long typeReservations) throws TypeNotFoundException, EquipmentNotFoundException;
}
