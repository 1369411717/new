package com.example.myspringboot.aspect;

import com.example.myspringboot.aspect.impl.UserValidatorImpl;
import com.example.myspringboot.aspect.service.UserValidator;
import com.example.myspringboot.pojo.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Service("myAspect")
@Aspect
public class MyAspect {
    //织入的点
    @Pointcut("execution(* com.example.myspringboot.aspect.impl.UserServiceImpl.printUser(..))")
    public void pointCut(){
    }
    @Before("pointCut() && args(user)")//织入方法前
    public void before(JoinPoint joinPoint, User user){
        Object[] args=joinPoint.getArgs();
        System.out.println("before。。。。");
    }
    @After("pointCut()")//织入方法后
    public void after(){
        System.out.println("after。。。。");
    }
    @AfterReturning("pointCut()")//方法正常返回
    public void afterReturning(){
        System.out.println("afterReturning。。。。");
    }
    @AfterThrowing("pointCut()")//方法抛出异常
    public void afterThrowing(){
        System.out.println("afterThrowing。。。。");
    }

    /*
     * 这里测试的 Spring 版本为 4.3.9，我使用 XML 测试 SpringAOP 的结果时， 是能够得到期待的结 果的，
     * 但用注解测试的时候总是在顺序上出现这样的出入， 估计是 Spring 版本之间的差异留下的问 题，这是在使用时需要注意的。
     * 所以在没有必要的时候，应尽量不要使用环绕通知，正如前面说过 的，它很强大，但是也很危险。
     */

    @Around("pointCut()")//环绕通知
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("around before。。。。");
        joinPoint.proceed();
        System.out.println("around after。。。。");
    }
    @DeclareParents(value = "com.example.myspringboot.aspect.impl.UserServiceImpl",
                    defaultImpl = UserValidatorImpl.class)//是引入新的类来增强服务
    public UserValidator userValidator;
}
