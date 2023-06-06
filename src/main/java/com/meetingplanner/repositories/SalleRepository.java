package com.meetingplanner.repositories;

import com.meetingplanner.entities.Equipment;
import com.meetingplanner.entities.Reservation;
import com.meetingplanner.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle,Long> {
    List<Salle> findSallesByReservationsNotInOrReservationsIsNull(List<Reservation> reservations);
    Salle findByReservations(Reservation reservations);
    @Query(value = "SELECT s FROM Salle s LEFT JOIN s.equipment eq GROUP BY s"
            + " HAVING SUM(CASE WHEN eq IN (:equipment) THEN 1 ELSE 0 END) = :equipmentSize")
    List<Salle> findSallesByEq(@Param("equipment") List<Equipment> equipment,
                                      @Param("equipmentSize") long equipmentSize);

}
