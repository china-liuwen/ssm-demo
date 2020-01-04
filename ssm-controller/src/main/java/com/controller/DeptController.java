package com.controller;

import com.dto.DeptDTO;
import com.dto.ResponseDTO;
import com.entity.DeptEntity;
import com.service.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Api(tags = "dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    //	get 获取 put 修改 post 添加 delete 删除

    @GetMapping("/dept")
    public ResponseDTO getAll(){
        List<DeptEntity> list = deptService.getAll();
        return ResponseDTO.newBuilder().code("200").data(list).build();
    }


    @DeleteMapping("/dept/{id}")
    @ApiOperation("根据ID删除")
    public ResponseDTO deleteDept(@PathVariable Integer id){
        if (deptService.delete(id)){
            return ResponseDTO.newBuilder().code("200").msg("删除成功！").build();
        }
        return ResponseDTO.newBuilder().code("500").msg("删除失败！").build();
    }

    @PutMapping("/dept/{id}")
    @ApiOperation("根据ID修改")
    public ResponseDTO updateDept(@PathVariable Integer id, @PathVariable DeptDTO deptDTO){
        DeptEntity deptEntity = new DeptEntity();
        BeanUtils.copyProperties(deptDTO,deptEntity);

        if (deptService.update(deptEntity)){
            return ResponseDTO.newBuilder().code("200").msg("修改成功！").build();
        }
        return ResponseDTO.newBuilder().code("500").msg("修改失败！").build();
    }

    @PostMapping("/dept")
    @ApiOperation("添加部门")
    public ResponseDTO insert(@RequestBody DeptDTO deptDTO){
        DeptEntity deptEntity = new DeptEntity();
        BeanUtils.copyProperties(deptDTO,deptEntity);

        if (deptService.insert(deptEntity)){
            return ResponseDTO.newBuilder().code("200").msg("添加成功！").build();
        }
        return ResponseDTO.newBuilder().code("500").msg("添加失败！").build();
    }
}






































