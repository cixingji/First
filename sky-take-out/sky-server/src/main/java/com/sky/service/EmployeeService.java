package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
    /**
     * 员工添加
     * @param employeeDTO
     * @return
     */
    void save(EmployeeDTO employeeDTO);

    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用员工账号
     * @param status
     * @param id
     */
    void startORstop(Integer status, Long id);

    /**
     * 根据id查询员工信息
     * @return
     */
    Employee getByIdid(Long id);
    /**
     * 编辑员工信息
     * @return
     */
    void update(EmployeeDTO employeeDTO);
}
