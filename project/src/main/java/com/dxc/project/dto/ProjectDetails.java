package com.dxc.project.dto;

public class ProjectDetails {
    private Integer projectId;
    private String projectName;
    private String projectLead;
    private Integer teamCount;
    private Long startDate;

    public ProjectDetails(Integer projectId, String projectName, String projectLead, Integer teamCount, Long startDate) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectLead = projectLead;
        this.teamCount = teamCount;
        this.startDate = startDate;
    }

    public ProjectDetails()
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

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }
}
