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

    @BeforeClass
    public static void setUpClass() throws IOException {
        factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
    }

    @Before
    public void setUp() throws IOException {
        session = factory.openSession();
    }

    @After
    public void tearDown() {
        session.commit();
        session.close();
    }

    @Test
    public void testUserFindAll() {
        List<User> users = session.selectList("User.findAll");
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

        session.insert("User.save", user);
        System.out.println(user);
    }

    @Test
    public void testUserDelete() {
        session.delete("User.delete", 55);
    }

    @Test
    public void testUserFind() {
        User user = session.selectOne("User.find", 41);
        System.out.println(user);
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
