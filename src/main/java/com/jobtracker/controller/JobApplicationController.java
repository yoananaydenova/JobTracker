package com.jobtracker.controller;

import com.jobtracker.model.JobApplication;
import com.jobtracker.repository.JobApplicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
@RequiredArgsConstructor
public class JobApplicationController {
    private final JobApplicationRepository applicationRepository;

    @GetMapping
    public List<JobApplication> getAllApplications() {
        return applicationRepository.findAll();
    }

    @PostMapping
    public JobApplication createApplication(@RequestBody JobApplication application) {
        return applicationRepository.save(application);
    }
}
