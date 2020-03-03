import controller.AccountController;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    private static ApplicationContext context;

    @BeforeClass
    public static void setUpClass(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test01(){
        AccountController controller = context.getBean("accountController", AccountController.class);
        controller.transfer();
    }
}
