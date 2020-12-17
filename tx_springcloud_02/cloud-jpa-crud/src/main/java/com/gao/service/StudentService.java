package com.gao.service;

import com.gao.dao.StudentDao;
import com.gao.domain.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: tx_springcloud_02
 * @description: 服务层
 * @author: gaowz
 * @create: 2020-12-11 10:43
 **/
@Service
@Transactional
public class StudentService {

    @Resource
    private StudentDao studentDao;
    /**
     * 向表中插入一条数据
     * @param student
     */
    public void addStudent(Student student){
        studentDao.save(student);
    }

    /**
     * 更新数据
     * @param student
     */
    public void updataStudent(Student student){
        studentDao.save(student);
    }

    /**
     * 根据id删除一条数据
     * @param id
     */
    public void deleteStudentById(Long id){
        studentDao.deleteById(id);
    }

    /**
     * 查询所有
     * @return
     */
    public List<Student> findAll(){
        return studentDao.findAll();
    }

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    public Student findStudentById(Long id){
        return studentDao.findById(id).get();
    }

    public List<Student> findStudentByName(String name){
        return studentDao.findByName(name);
    }

}
