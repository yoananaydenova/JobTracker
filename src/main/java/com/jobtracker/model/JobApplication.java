package com.jobtracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String position;
    private LocalDate applicationDate = LocalDate.now();
    private String status; // "APPLIED", "INTERVIEW", "OFFER", "REJECTED"
    private String notes;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
