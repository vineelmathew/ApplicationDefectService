package com.dxc.defects.dao;
import com.dxc.defects.entity.Defect;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IDefectDao extends JpaRepository<Defect,Integer> {
}
