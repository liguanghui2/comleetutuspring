package com.leetutu.dao;

/**
 * 学习Spring AOP
 */

public interface UserDao {
    /*
    添加用户
     */
    public int addUser();

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

}
