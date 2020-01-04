package com.dao;

import com.entity.DeptEntity;

import java.util.List;

public interface DeptDao  {
    boolean insert(DeptEntity deptEntity);
    boolean delete(Integer id);
    boolean update(DeptEntity deptEntity);
    List<DeptEntity> getAll();
}
