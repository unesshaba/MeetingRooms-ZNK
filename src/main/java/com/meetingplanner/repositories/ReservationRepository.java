package com.meetingplanner.repositories;

import com.meetingplanner.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    List<Reservation> findByStartTimeGreaterThanEqualAndEndTimeLessThanEqual(Date startTime, Date endTime);
    List<Reservation> findByEndTimeBefore(Date endTime);
}
