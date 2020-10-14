package com.dxc.defects.utility;

import com.dxc.defects.dto.DefectDto;
import com.dxc.defects.dto.ProjectDto;
import com.dxc.defects.entity.Defect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class DefectUtility {
public DefectDto defectDto(Defect defect, ProjectDto projectDto)
{
    LocalDateTime startDate=defect.getDefectDate();
    long defectDate=toMillis(startDate);
    DefectDto convert=new DefectDto();
    long projectDate=projectDto.getStartDate();
    convert.setSummary(defect.getSummary());
    convert.setDefectDate(defectDate);
    convert.setPriority(defect.getPriority());
    convert.setId(defect.getId());
    //project fields
    convert.setStartDate(projectDate);
    convert.setProjectId(projectDto.getProjectId());
    convert.setProjectName(projectDto.getProjectName());
    convert.setProjectLead(projectDto.getProjectLead());
    convert.setTeamCount(projectDto.getTeamCount());
    return convert;
}

    long toMillis(LocalDateTime Time){
        ZonedDateTime zonedDateTime=ZonedDateTime.of(Time, ZoneId.systemDefault());
        long millis= zonedDateTime.toInstant().toEpochMilli();
        return millis;
    }


}
