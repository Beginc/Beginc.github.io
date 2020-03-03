package service.impl;

import dao.UserDao;
import service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
