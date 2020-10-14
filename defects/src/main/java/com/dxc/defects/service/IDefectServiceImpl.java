package com.dxc.defects.service;
import com.dxc.defects.dao.IDefectDao;
import com.dxc.defects.entity.Defect;
import com.dxc.defects.exceptions.DefectNotFoundException;
import com.dxc.defects.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class IDefectServiceImpl implements IDefectService {

    @Autowired
    private IDefectDao defectDao;

    @Override
    public Defect addCreate(Defect defect) {
        validate(defect);
        defect=defectDao.save(defect);
        return defect;
    }

    private void validate(Defect defect) {
        if(defect==null)
        {
            throw new InvalidArgumentException("Defect cant be null");
        }
    }

    @Override
    public void removeDefect(Integer id) {
       getByDefectId(id);
       defectDao.deleteById(id);
    }

     public Defect getByDefectId(Integer id) {
        Optional<Defect> exists=defectDao.findById(id);
        if(!exists.isPresent())
        {
            throw new DefectNotFoundException("Defect not found for the id "+id);
        }
        Defect defect=exists.get();
        return defect;
    }

    @Override
    public List<Defect> getAllDefects() {
        List<Defect>defectList=defectDao.findAll();
        return defectList;
    }
}
