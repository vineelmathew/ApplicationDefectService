package com.dxc.defects.controller;

import com.dxc.defects.dto.CreateDefect;
import com.dxc.defects.dto.DefectDto;
import com.dxc.defects.dto.ProjectDto;
import com.dxc.defects.entity.Defect;
import com.dxc.defects.service.IDefectService;
import com.dxc.defects.utility.DateTimeUtil;
import com.dxc.defects.utility.DefectUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/defects")
public class DefectRestController {
    @Autowired
    private IDefectService defectService;
    @Autowired
    private DateTimeUtil timeUtil;
    @Autowired
    private DefectUtility defectUtility;
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public DefectDto addDefect(@RequestBody CreateDefect request)
    {

        long startDate=request.getDefectDate();
        LocalDateTime startDateConvert=timeUtil.toDateTime(startDate);
        long defecttDate=request.getDefectDate();
        Integer pId=request.getProjectId();
        LocalDateTime dateConvert=timeUtil.toDateTime(defecttDate);
        ProjectDto projectId=getProjectId(pId); //from the project microservice
        Defect defect=new Defect(request.getSummary(),request.getPriority(),startDateConvert,projectId.getProjectId());
        defect=defectService.addCreate(defect);
        DefectDto convertDto=defectUtility.defectDto(defect,projectId);
        return convertDto;
    }


    public ProjectDto getProjectId(Integer id)
    {
          String geturl="http://localhost:8888/projects/get/"+id;
          ProjectDto projectDto=restTemplate.getForObject(geturl,ProjectDto.class);
          return projectDto;
    }
   @GetMapping("/getall")
    public List<DefectDto> getAllDefects()
    {
        List<Defect> defectList=defectService.getAllDefects();
        List<DefectDto> results=new ArrayList<>();
        for(Defect defect:defectList)
        {
            Integer pId=defect.getProjectId();
            ProjectDto projectId=getProjectId(pId);
            DefectDto convertDto=defectUtility.defectDto(defect,projectId);
            results.add(convertDto);
        }
        return results;
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable(value = "id")Integer id)
    {
        defectService.removeDefect(id);
    }

}
