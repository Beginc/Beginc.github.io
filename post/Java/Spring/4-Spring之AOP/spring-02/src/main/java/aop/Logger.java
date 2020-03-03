package aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {

    void before() {
        System.out.println("[Before]: 记录日志");
    }

    void after() {
        System.out.println("[After]: 记录日志");
    }

    void afterReturning() {
        System.out.println("[AfterReturning]: 记录日志");
    }

    void afterThrowing() {
        System.out.println("[After-Throwing]: 记录日志");
    }

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
