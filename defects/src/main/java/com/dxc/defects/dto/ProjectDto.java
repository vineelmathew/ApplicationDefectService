package com.dxc.defects.dto;

public class ProjectDto {
    private Integer projectId;
    private String projectName;
    private String projectLead;
    private Integer teamCount;
    private long startDate;

    public ProjectDto(Integer projectId, String projectName, String projectLead, Integer teamCount, long startDate) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectLead = projectLead;
        this.teamCount = teamCount;
        this.startDate = startDate;
    }

    public ProjectDto()
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

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }
}
