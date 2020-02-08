package provider;

import org.apache.ibatis.jdbc.SQL;
import pojo.User;

import java.util.List;
import java.util.Map;

public class UserProvider {

    public String findByUsernameOrSex(Map<String, Object> params) {
        User user = (User) params.get("user");
        SQL sql = new SQL().SELECT("username", "address", "sex", "birthday").FROM("user");

        if(user.getUsername() != null)
            sql.WHERE("username = #{user.username}");
        if(user.getSex() != null)
            sql.WHERE("sex = #{user.sex}");

        return sql.toString();
    }

    public String findInIDs(Map<String, Object> params){
        List<Integer> ids = (List<Integer>) params.get("ids");
        StringBuilder sql = new StringBuilder();
        sql.append("select * from user ");

        if(ids != null && ids.size() > 0){
            sql.append("where id in (");
            int i = 0;
            for (i = 0; i < ids.size() - 1; i++) {
                sql.append(ids.get(i)).append(",");
            }
            sql.append(ids.get(i)).append(")");
        }

        return sql.toString();
    }
}
