package com.gao.controller;

import com.gao.domain.CommonResult;
import com.gao.domain.Student;
import com.gao.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: tx_springcloud_02
 * @description: 控制层
 * @author: gaowz
 * @create: 2020-12-11 14:09
 **/
@RestController
public class StudentController {

    @Resource
    private StudentService studentService;
    /**
     * 新增一条数据
     * @param student
     * @return
     */
    @PostMapping(value = "/addStudent")
    public CommonResult addStudent(Student student) {

        try {
            studentService.addStudent(student);
            return new CommonResult(200, "新增成功", student);
        } catch (Exception e) {
            e.printStackTrace();
            return new CommonResult(500, "新增失败", student);
        }
    }

    /**
     * 查询所有的数据
     *
     * @return
     */
    @GetMapping(value = "/findAll")
    public CommonResult findAll() {
        try {
            List<Student> allStudent = studentService.findAll();
            return new CommonResult(200, "所有的数据查询成功", allStudent);
        } catch (Exception e) {
            e.printStackTrace();
            return new CommonResult(500, "查询失败", null);
        }
    }

    /**
     * 根据id查询对应的数据
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/findById/{id}")
    public CommonResult findById(@PathVariable(value = "id") Long id) {

        try {
            Student student = studentService.findStudentById(id);
            return new CommonResult(200, "查询成功", student);
        } catch (Exception e) {

            e.printStackTrace();
            return new CommonResult(500, "查询失败", null);
        }
    }
    @PostMapping(value = "/updateStudent")
    public CommonResult updateStudent(Student student){

        CommonResult commonResult = new CommonResult();
        try{
            studentService.updataStudent(student);
            commonResult.setCode(200);
            commonResult.setMessage("更新成功");
            commonResult.setData(student);
        }catch (Exception e){
            e.printStackTrace();
        }
        return commonResult;
    }
}
