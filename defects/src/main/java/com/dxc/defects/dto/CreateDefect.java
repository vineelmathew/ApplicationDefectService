package com.dxc.defects.dto;

public class CreateDefect {
    private String summary;
    private String priority;
    private long defectDate;
    private Integer projectId;

    public CreateDefect(String summary, String priority, long defectDate, Integer projectId) {
        this.summary = summary;
        this.priority = priority;
        this.defectDate = defectDate;
        this.projectId = projectId;
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
