package com.meetingplanner.repositories;

import com.meetingplanner.entities.TypeReservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TypeReservationRepository extends JpaRepository<TypeReservation, Long> {
    TypeReservation findByNom(String nom);
}
