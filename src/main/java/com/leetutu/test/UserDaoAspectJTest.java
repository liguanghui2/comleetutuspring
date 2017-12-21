package com.leetutu.test;

import com.leetutu.dao.UserDao;
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

    @Test
    public void aspectJTest(){
        userDao.addUser();
    }
}
