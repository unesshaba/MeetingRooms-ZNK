package com.meetingplanner.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private int capaciter;
    @Transient
    private int capacityInCovid;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Equipment> equipment = new ArrayList<>();
    @OneToMany(mappedBy = "salle", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Reservation> reservations = new ArrayList<>();


    public int getCapacityInCovid() {
        return (capaciter*70)/100;
    }

    @Override
    public String toString() {

        return "Salle{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", capaciter=" + capaciter +
                ", capacityInCovid=" + this.getCapacityInCovid() +
                ", equipment=" + this.getEquipment().toString() +
                ", reservations=" + this.getReservations().toString() +
                '}';
    }

}
