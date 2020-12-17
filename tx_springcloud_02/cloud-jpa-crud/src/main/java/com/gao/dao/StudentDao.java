package com.gao.dao;

import com.gao.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: tx_springcloud_02
 * @description: 持久层接口
 * @author: gaowz
 * @create: 2020-12-11 10:32
 **/

//泛型中第一个参数是实体类，第二个参数是id类型
public interface StudentDao extends JpaRepository<Student,Long> {

    public List<Student>  findByName(String name);



}
