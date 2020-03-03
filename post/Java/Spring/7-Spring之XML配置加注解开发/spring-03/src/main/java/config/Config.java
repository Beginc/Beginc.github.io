package config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScans({
        @ComponentScan("dao"),
        @ComponentScan("service"),
        @ComponentScan("controller"),
        @ComponentScan("pojo"),
        @ComponentScan("aop")
})
@Import(JdbcConfig.class)
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class Config {


}
