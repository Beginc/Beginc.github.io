import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.DITest;

public class Test01 {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DITest bean = context.getBean("testBean", DITest.class);
        System.out.println(bean);

        DITest child = context.getBean("child", DITest.class);
        System.out.println(child);
    }


}
