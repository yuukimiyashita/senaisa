package com.mypackage.service;

import com.mypackage.model.Schedule;
import com.mypackage.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

     @Override
    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }
    
    @Override
    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }

    @Override
    public List<Schedule> getSchedulesAfterDate(LocalDateTime dateTime) {
        return scheduleRepository.findByDateTimeAfter(dateTime);
    }
    
    @Override
    public List<Schedule> getSchedulesWithinDateRange(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return scheduleRepository.findByDateTimeBetween(startDateTime, endDateTime);
    }

    
}
