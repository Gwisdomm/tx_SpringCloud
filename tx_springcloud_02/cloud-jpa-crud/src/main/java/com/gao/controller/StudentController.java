package com.gao.controller;

import com.gao.domain.CommonResult;
import com.gao.domain.Student;
import com.gao.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: tx_springcloud_02
 * @description: 控制层
 * @author: gaowz
 * @create: 2020-12-21 22:15
 **/
@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 新增一个用户
     * @param student
     * @return
     */
    @PostMapping(value = "/addStudent")
    public CommonResult addStudent(Student student){
        try{
            studentService.addStudent(student);
            return new CommonResult(200,"新增成功",null);
        }catch (Exception e){
            e.printStackTrace();
            return new CommonResult(500,"新增失败",student);
        }
    }

    /**
     * 查询所有的学生
     * @return
     */
    @GetMapping("/findAllStudent")
    public CommonResult findStudent(){

        try{
            List<Student> allStudent = studentService.findAll();
            return new CommonResult(200,"查询成功",allStudent);
        }catch (Exception e){
            e.printStackTrace();
            return new CommonResult(500,"查询失败",null);
        }
    }


}
