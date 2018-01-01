package com.leetutu.dao.impl;

import com.leetutu.annotation.test.SystemLogAnnotation;
import com.leetutu.dao.StudentDao;
import com.leetutu.vo.Student;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author: Kevin.Lee
 * @create: 2017-12-29 11:29:30
 **/

@Repository
public class StudentDaoImpl implements StudentDao{

    public int insertStudent(Student student) {
        return 1;
    }

    public int deleteStudent(Student student) {
        return 1;
    }

    public void updateStudent(Student student) {

    }

    @SystemLogAnnotation
    public Student getStudentById(Long id) {
        Student student=new Student();
        student.setId(2508L);
        student.setName("liguanghui");
        student.setMajor("sorft dev");
        return student;
    }
}
