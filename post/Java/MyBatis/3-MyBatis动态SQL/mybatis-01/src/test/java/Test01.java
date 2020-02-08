import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pojo.User;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Test01 {
    private static final Logger logger = LoggerFactory.getLogger(Test01.class);
    private static SqlSessionFactory factory;
    private SqlSession session;
    private UserMapper userMapper;

    @BeforeClass
    public static void setUpClass() throws IOException {
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
    }

    @Before
    public void setUp() throws IOException {
        session = factory.openSession();
        userMapper = session.getMapper(UserMapper.class);
    }

    @After
    public void tearDown() {
        session.commit();
        session.close();
    }

    @Test
    public void testUserFindAll() {
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testUserSave() {
        User user = new User();
        user.setAddress("耒阳");
        user.setUsername("罗浩文");
        user.setBirthday(new Date());
        user.setSex("男");

        userMapper.save(user);
        System.out.println(user);
    }

    @Test
    public void testUserDelete() {
        userMapper.delete(57);
    }

    @Test
    public void testUserFind() {
        User user = userMapper.find(41);
        System.out.println(user);
    }

    @Test
    public void testUserFindByUsernameOrSex(){
        User user = new User();
        List<User> users;

        // 根据username查询
        user.setUsername("罗浩文");
        users = userMapper.findByUsernameOrSex(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
        System.out.println("-------------------------------------------------------------");

        // 根据sex查询
        user.setUsername(null);
        user.setSex("男");
        users = userMapper.findByUsernameOrSex(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
        System.out.println("-------------------------------------------------------------");

        // 根据username和sex查询
        user.setUsername("罗浩文");
        user.setSex("男");
        users = userMapper.findByUsernameOrSex(user);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @Test
    public void testUserFindInIDs(){
        List<Integer> ids = List.of(41, 42, 43);
        List<User> users = userMapper.findInIDs(ids);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testAccountFindAll() {

    }

    @Test
    public void testAccountSave() {

    }

    @Test
    public void testAccountDelete() {

    }

    @Test
    public void testAccountFind() {

    }
}
