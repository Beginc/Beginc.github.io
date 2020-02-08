package mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import pojo.Account;

import java.util.List;

public interface AccountMapper {
    @Select("select * from account")
    @Results(
            id = "accountMap",
            value = {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "money", property = "money"),
                    @Result(
                            column = "uid",
                            property = "user",
                            one = @One(select = "mapper.UserMapper.find", fetchType = FetchType.EAGER)
                    )
            }
    )
    List<Account> findAll();

    @Select("select * from account where id = #{id}")
    @ResultMap("accountMap")
    Account find(Integer id);

    @Select("select * from account where uid = #{uid}")
    @ResultMap("accountMap")
    List<Account> findByUID(Integer uid);

    @Insert("insert into account (uid, money) values (#{uid}, #{money})")
    @SelectKey(statement = "select LAST_INSERT_ID()", keyColumn = "id", keyProperty = "id", before = false, resultType = Integer.class)
    void save(Account account);

    @Update("update account set uid = #{uid}, money = #{money} where id = #{id}")
    void update(Account account);

    @Delete("delete from account where id = #{id}")
    void delete(Integer id);
}
