package com.dxc.defects.service;

import com.dxc.defects.entity.Defect;

import java.util.List;

public interface  IDefectService {
    Defect addCreate(Defect defect);
    void removeDefect(Integer id);
    List<Defect> getAllDefects();
    Defect getByDefectId(Integer id);
}
