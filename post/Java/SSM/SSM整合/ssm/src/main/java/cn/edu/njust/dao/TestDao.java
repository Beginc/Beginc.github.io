package cn.edu.njust.dao;

import cn.edu.njust.pojo.TestAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("testDao")
@Mapper
public interface TestDao {

    @Select("select * from account")
    List<TestAccount> findAll();
}
