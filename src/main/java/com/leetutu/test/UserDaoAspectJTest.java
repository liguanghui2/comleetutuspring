package com.leetutu.test;

import com.leetutu.dao.StudentDao;
import com.leetutu.dao.UserDao;
import com.leetutu.vo.Student;
import com.leetutu.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserDaoAspectJTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private StudentDao studentDao;

    @Test
    public void aspectJTest(){
        User user=new User();
        user.setId(19L);
        user.setName("test");
        userDao.addUser(user);
        userDao.deleteUser();
        userDao.findUserById(1234L);
    }

    @Test
    public void studentDaoTest(){
        Student stu=studentDao.getStudentById(123L);
        System.out.println("————————————————————"+stu.toString());
    }
}
