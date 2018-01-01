package com.leetutu.dao.impl;

import com.leetutu.annotation.test.SystemLogAnnotation;
import com.leetutu.dao.UserDao;
import com.leetutu.vo.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

   @SystemLogAnnotation(description = "添加用户")
    public int addUser(User uer) {
        System.out.println("add user .....");
        return 666;
    }

    public void updateUser() {
        System.out.println("update user.....");
    }

    @SystemLogAnnotation(description = "删除用户")
    public int deleteUser() {
        System.out.println("delete a user.....");
        return 1;
    }

    public void findUser() {
        System.out.println("find a user.....");
    }

    @SystemLogAnnotation(description = "删除用户")
    public User findUserTest(Long id) {
        System.out.println("进入。。。。。findUserTest");
           User user=new User();
           user.setId(1234L);
           user.setName("小明");
        return user;
    }
}
