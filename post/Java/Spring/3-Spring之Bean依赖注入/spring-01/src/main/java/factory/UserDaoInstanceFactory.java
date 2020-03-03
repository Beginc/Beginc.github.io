package factory;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class UserDaoInstanceFactory {

    public UserDao getInstance(){
        return new UserDaoImpl();
    }
}
