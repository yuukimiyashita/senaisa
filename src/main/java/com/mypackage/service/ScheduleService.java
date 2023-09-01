package com.mypackage.service;

import com.mypackage.model.Schedule;

import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleService {

    List<Schedule> getSchedulesAfterDate(LocalDateTime dateTime);

    List<Schedule> getSchedulesWithinDateRange(LocalDateTime startDateTime, LocalDateTime endDateTime);

    List<Schedule> getAllSchedules();
    
    Schedule createSchedule(Schedule schedule);

    void deleteSchedule(Long id);
}
