package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    User find(Integer id);

    void save(User user);

    void update(User user);

    void delete(Integer id);

    List<User> findByUsernameOrSex(User user);

    List<User> findInIDs(List<Integer> ids);
}
