package cn.jiyun.mapper;

import cn.jiyun.pojo.Emp;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface EmpMapper extends Mapper<Emp> {
    void addEmp(@Param(value="emp") Emp emp);

    List<Emp> findAll();

    void delEmpById(Integer eid);

    Emp edit(Integer eid);


    void updateEmp(@Param(value="emp") Emp emp);
}
