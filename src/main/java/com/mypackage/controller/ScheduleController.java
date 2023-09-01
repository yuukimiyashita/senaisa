package com.mypackage.controller;

import com.mypackage.model.Schedule;
import com.mypackage.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/list")
    public String listSchedules(Model model) {
        List<Schedule> schedules = scheduleService.getAllSchedules();
        model.addAttribute("schedules", schedules);
        return "scheduleList";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("schedule", new Schedule());
        return "scheduleForm";
    }

    @PostMapping("/create")
    public String createSchedule(@ModelAttribute("schedule") Schedule schedule) {
        scheduleService.createSchedule(schedule);
        return "redirect:/schedule/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteSchedule(@PathVariable Long id) {
        scheduleService.deleteSchedule(id);
        return "redirect:/schedule/list";
    }
}
