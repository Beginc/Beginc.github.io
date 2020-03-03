package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(public void service.impl.AccountServiceImpl.transfer(int, int, int))")
    void accountServicePointcut(){};

    @Before("accountServicePointcut()")
    void before() {
        System.out.println("[Before]: 记录日志");
    }
    @After("accountServicePointcut()")
    void after() {
        System.out.println("[After]: 记录日志");
    }
    @AfterReturning("accountServicePointcut()")
    void afterReturning() {
        System.out.println("[AfterReturning]: 记录日志");
    }
    @AfterThrowing("accountServicePointcut()")
    void afterThrowing() {
        System.out.println("[After-Throwing]: 记录日志");
    }
    @Around("accountServicePointcut()")
    Object around(ProceedingJoinPoint proceedingJoinPoint){
        try{
            // 前置
            before();
            Object[] args = proceedingJoinPoint.getArgs();
            // 方法调用
            Object returnVal = proceedingJoinPoint.proceed(args);
            // 后置
            afterReturning();
            return returnVal;
        } catch (Throwable throwable) {
            // 异常
            afterThrowing();
            throwable.printStackTrace();
        } finally {
            // 最终
            after();
        }

        return null;
    }
}
