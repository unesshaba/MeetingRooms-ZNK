package com.meetingplanner.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    private int numberOfAttendees;
    @ManyToOne
    private Salle salle;
    @ManyToOne
    private TypeReservation typeReservation;

    @Override
    public String toString() {
        return "Reservation{" +
                "name='" + name + '\'' +
                '}';
    }

}
