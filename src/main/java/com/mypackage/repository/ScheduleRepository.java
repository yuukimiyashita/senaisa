package com.mypackage.repository;

import com.mypackage.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    List<Schedule> findByDateTimeAfter(LocalDateTime dateTime);
    
    List<Schedule> findByDateTimeBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);
}
