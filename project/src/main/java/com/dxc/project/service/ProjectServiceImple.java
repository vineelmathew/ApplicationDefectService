package com.dxc.project.service;

import com.dxc.project.dao.IProjectDao;
import com.dxc.project.entity.Project;
import com.dxc.project.exception.ProjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ProjectServiceImple implements IProjectService{

    @Autowired
    private IProjectDao projectDao;
    @Override
    public Project addProject(Project project) {
        validate(project);
        project=projectDao.save(project);
        return project;
    }

    private void validate(Project project) {
        if(project==null)
        {
            throw new NullPointerException("project cant be null");
        }
    }

    @Override
    public void removeProject(Integer id) {
          getByprojectId(id);
          projectDao.deleteById(id);
    }

    @Override
    public List<Project> getAllProjects() {
        List<Project>projectList=projectDao.findAll();
        return projectList;
    }

    @Override
    public Project getByprojectId(Integer id) {
        Optional<Project> exists = projectDao.findById(id);
        if (!exists.isPresent()) {
            throw new ProjectNotFoundException("project not found for the id " + id);
        }
        Project project = exists.get();
        return project;
    }
}
