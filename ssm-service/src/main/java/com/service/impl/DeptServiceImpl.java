package com.service.impl;

import com.dao.DeptDao;
import com.entity.DeptEntity;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean insert(DeptEntity deptEntity) {
        return deptDao.insert(deptEntity);
    }

    @Override
    public boolean delete(Integer id) {
        return deptDao.delete(id);
    }

    @Override
    public boolean update(DeptEntity deptEntity) {
        return deptDao.update(deptEntity);
    }

    @Override
    public List<DeptEntity> getAll() {
        return deptDao.getAll();
    }
}
