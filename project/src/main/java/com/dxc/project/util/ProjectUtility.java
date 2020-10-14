package com.dxc.project.util;

import com.dxc.project.dto.ProjectDetails;
import com.dxc.project.entity.Project;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class ProjectUtility {

        public ProjectDetails projectDto(Project project)
        {
            LocalDateTime startDate=project.getStartDate();
            long startDateConvert=toMillis(startDate);

            ProjectDetails details=new ProjectDetails(
                    project.getProjectId(),project.getProjectName(),
                    project.getProjectLead(),project.getTeamCount(),startDateConvert);
            return details;
        }
        long toMillis(LocalDateTime Time){
            ZonedDateTime zonedDateTime=ZonedDateTime.of(Time, ZoneId.systemDefault());
            long millis= zonedDateTime.toInstant().toEpochMilli();
            return millis;
        }
    }

