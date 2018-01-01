package com.leetutu.dao;

import com.leetutu.vo.Student;

public interface StudentDao {

    /**
     * 添加一个学生
     * @param student
     * @return
     */
    public int insertStudent(Student student);

    /**
     * 删除一个学生
     */
    public int deleteStudent(Student student);

    /**
     * 更新一个学生
     */
    public void updateStudent(Student student);

    /**
     * 根据学号查找一个学生
     */
    public Student getStudentById(Long id);

}
