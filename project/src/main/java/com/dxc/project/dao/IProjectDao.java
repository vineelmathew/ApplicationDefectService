package com.dxc.project.dao;
import com.dxc.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IProjectDao extends JpaRepository<Project,Integer> {

}
