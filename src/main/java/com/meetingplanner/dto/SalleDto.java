package com.meetingplanner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalleDto {
    Long Id;
    String name;
    int capaciter;
    int capacityInCovid;
    List<EquipmentDto> equipment;
    List<ReservationDto> reservations;
}
