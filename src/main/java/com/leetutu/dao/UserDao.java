package com.leetutu.dao;

import com.leetutu.vo.User;

/**
 * 学习Spring AOP
 */

public interface UserDao {
    /*
    添加用户
     */
    public int addUser(User user);

    /*
    更新用户
     */
    public void updateUser();

    /*
    删除用户
     */
    public int deleteUser();

    /*
    查询用户
     */
    public void findUser();

    /*
    根据用户ID查询用户
     */
    public User findUserTest(Long id);

}
