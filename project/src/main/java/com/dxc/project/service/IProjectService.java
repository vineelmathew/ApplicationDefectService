package com.dxc.project.service;

import com.dxc.project.entity.Project;

import java.util.List;

public interface IProjectService {
    Project addProject(Project project);
    void removeProject(Integer id);
    List<Project> getAllProjects();
    Project getByprojectId(Integer id);
}
