package com.leetutu.dao.impl;

import com.leetutu.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    public int addUser() {
        System.out.println("add user .....");
        return 666;
    }

    public void updateUser() {
        System.out.println("update user.....");
    }

    public int deleteUser() {
        System.out.println("delete a user.....");
        return 1;
    }

    public void findUser() {
        System.out.println("find a user.....");
    }
}
