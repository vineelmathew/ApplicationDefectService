package com.dxc.project.dto;

public class CreateProject {
    private String projectName;
    private String projectLead;
    private Integer teamCount;
    private long startDate;

    public CreateProject(String projectName, String projectLead, Integer teamCount, long startDate) {
        this.projectName = projectName;
        this.projectLead = projectLead;
        this.teamCount = teamCount;
        this.startDate = startDate;
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

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }
}
