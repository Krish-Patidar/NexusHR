package com.nexushr.dto.project;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MilestoneDto {
    private Long id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private String status;
}