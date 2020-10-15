package com.dxc.project.controller;
import com.dxc.project.dto.CreateProject;
import com.dxc.project.dto.ProjectDetails;
import com.dxc.project.dto.UpdateProject;
import com.dxc.project.entity.Project;
import com.dxc.project.service.IProjectService;
import com.dxc.project.util.DateTimeUtil;
import com.dxc.project.util.ProjectUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/projects")
public class ProjectRestController {
    @Autowired
    private IProjectService service;
    @Autowired
    private DateTimeUtil convertTime;
    @Autowired
    private ProjectUtility projectUtility;

    @PostMapping("/add")
    public ProjectDetails addProject(@RequestBody CreateProject request)
    {
        long startDate=request.getStartDate();
        LocalDateTime startDateConvert=convertTime.toDateTime(startDate);
        Project project=new Project();
        project.setProjectLead(request.getProjectLead());
        project.setProjectName(request.getProjectName());
        project.setTeamCount(request.getTeamCount());
        project.setStartDate(startDateConvert);
        service.addProject(project);
        ProjectDetails convertDto=projectUtility.projectDto(project);
        return convertDto;
    }

    @GetMapping("get/{id}")
    public ProjectDetails getByProjectId(@PathVariable("id") Integer projectId)
    {
        Project project=service.getByprojectId(projectId);
        ProjectDetails convertDto=projectUtility.projectDto(project);
        return convertDto;
    }
    @GetMapping
    public List<ProjectDetails> getAllProjects()
    {
        List<Project>projectList=service.getAllProjects();
        List<ProjectDetails> results=new ArrayList<>();
        for(Project project:projectList)
        {
            ProjectDetails convertDto=projectUtility.projectDto(project);
            results.add(convertDto);
        }
        return results;
    }

    @PutMapping("/update")
    public ProjectDetails updateProject(@RequestBody UpdateProject request)
    {
        long startDate=request.getStartDate();
        LocalDateTime startDateConvert=convertTime.toDateTime(startDate);
        Project project=new Project();
        project.setProjectLead(request.getProjectLead());
        project.setProjectName(request.getProjectName());
        project.setTeamCount(request.getTeamCount());
        project.setStartDate(startDateConvert);
        project.setProjectId(request.getProjectId());
        service.addProject(project);
        ProjectDetails convertDto=projectUtility.projectDto(project);
        return convertDto;
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProjectById(@PathVariable(value = "id")Integer id)
    {
        service.removeProject(id);
    }
}
