package com.dxc.project.entity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer projectId;
    private String projectName;
    private String projectLead;
    private Integer teamCount;
    private LocalDateTime startDate;

    public Project(String projectName, String projectLead, Integer teamCount, LocalDateTime startDate) {
        this.projectName = projectName;
        this.projectLead = projectLead;
        this.teamCount = teamCount;
        this.startDate = startDate;
    }
    public Project()
    {

    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public Integer getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(Integer teamCount) {
        this.teamCount = teamCount;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
}
