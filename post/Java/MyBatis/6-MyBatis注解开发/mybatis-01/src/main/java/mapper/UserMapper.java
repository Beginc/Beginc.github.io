package mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import pojo.User;
import provider.UserProvider;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    @Results(
            id = "userMap",
            value = {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "username", property = "username"),
                    @Result(column = "address", property = "address"),
                    @Result(column = "birthday", property = "birthday"),
                    @Result(
                            column = "id",
                            property = "accounts",
                            many = @Many(select = "mapper.AccountMapper.findByUID", fetchType = FetchType.LAZY)
                    )
            }
    )
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    @ResultMap("userMap")
    User find(Integer id);

    @Insert("insert into user (username, address, sex, birthday) values (#{username}, #{address}, #{sex}, #{birthday})")
    @SelectKey(statement = "select LAST_INSERT_ID()", keyColumn = "id", keyProperty = "id", before = false, resultType = Integer.class)
    void save(User user);

    @Update("update user set username = #{username}, address = #{address}, sex = #{sex}, birthday = #{birthday} where id = #{id}")
    void update(User user);

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);
    
    @SelectProvider(type = UserProvider.class, method = "findByUsernameOrSex")
    @ResultMap("userMap")
    List<User> findByUsernameOrSex(@Param("user") User user);

    @SelectProvider(type = UserProvider.class, method = "findInIDs")
    @ResultMap("userMap")
    List<User> findInIDs(@Param("ids") List<Integer> ids);
}
