package com.yaopingping.mybatis;

public class TestUser {
    public static void main(String [] args){
        User user = new User();
        user.setName("dandan");
        user.setWebsite("http://www.dandan.com");
        user.setPhone("18076269707");
        UserDao userDao = new UserDao();
//        userDao.save(user);

        System.out.println(userDao.select(7));
    }
}
