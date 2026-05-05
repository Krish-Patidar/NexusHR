package com.nexushr.controller;

import com.nexushr.dto.project.*;
import com.nexushr.service.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;
    @PostMapping
    public ProjectResponseDto createProject(@Valid @RequestBody ProjectRequestDto dto) {
        return projectService.createProject(dto);
    }

    @PostMapping("/{projectId}/assign")
    public String assignTeam(@PathVariable Long projectId, @Valid @RequestBody AssignTeamRequestDto dto) {
        return projectService.assignTeam(projectId, dto);
    }

    @DeleteMapping("/{projectId}/employees/{employeeId}")
    public String removeEmployeeFromProject(@PathVariable Long projectId, @PathVariable Long employeeId) {
        return projectService.removeEmployeeFromProject(projectId, employeeId);
    }
    
    @GetMapping("/{id}/backlog")
    public List<MilestoneDto> getProjectBacklog(@PathVariable Long id) {
        return projectService.getProjectBacklog(id);
    }
}