package factory;

import service.UserService;
import service.impl.UserServiceImpl;

public class UserServiceStaticFactory {

    public static UserService getInstance() {
        return new UserServiceImpl();
    }
}
