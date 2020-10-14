package com.dxc.defects.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Defect {
    @GeneratedValue
    @Id
    private Integer Id;
    private String summary;
    private String priority;
    private LocalDateTime defectDate;
    private Integer projectId;

    public Defect(String summary, String priority, LocalDateTime defectDate, Integer projectId) {
        this.summary = summary;
        this.priority = priority;
        this.defectDate = defectDate;
        this.projectId=projectId;
    }
    public Defect()
    {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public LocalDateTime getDefectDate() {
        return defectDate;
    }

    public void setDefectDate(LocalDateTime defectDate) {
        this.defectDate = defectDate;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Defect defect = (Defect) o;
        return Id.equals(defect.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
