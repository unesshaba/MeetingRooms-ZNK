package com.meetingplanner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto{
    Long id;
    String name;
    Date startTime;
    Date endTime;
    int numberOfAttendees;
    TypeReservationDto typeReservation;
}
