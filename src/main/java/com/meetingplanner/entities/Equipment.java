package com.meetingplanner.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "salle_equipment",
            joinColumns = @JoinColumn(name = "equipment_id"),
            inverseJoinColumns = @JoinColumn(name = "salle_id"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Salle> salles = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "typeRes_equipment",
            joinColumns = @JoinColumn(name = "equipment_id"),
            inverseJoinColumns = @JoinColumn(name = "typeReservation_id"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<TypeReservation> typeReservations = new ArrayList<>();

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

}
