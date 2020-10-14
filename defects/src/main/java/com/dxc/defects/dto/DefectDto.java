package com.dxc.defects.dto;

import javax.persistence.Id;

public class DefectDto {
    private Integer id;
    private String summary;
    private String priority;
    private long defectDate;
    private Integer projectId;
    private String projectName;
    private String projectLead;
    private Integer teamCount;
    private long startDate;

    public DefectDto(Integer id, String summary, String priority, long defectDate, Integer projectId,
                     String projectName, String projectLead, Integer teamCount, long startDate) {
        this.id = id;
        this.summary = summary;
        this.priority = priority;
        this.defectDate = defectDate;
        this.projectId = projectId;
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

    public DefectDto()
    {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public long getDefectDate() {
        return defectDate;
    }

    public void setDefectDate(long defectDate) {
        this.defectDate = defectDate;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}
