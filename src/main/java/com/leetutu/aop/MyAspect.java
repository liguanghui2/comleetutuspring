package com.leetutu.aop;

import com.alibaba.fastjson.JSONObject;
import com.leetutu.vo.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Aspect
public class MyAspect {

    public MyAspect(){
    }

    @Pointcut("@annotation(com.leetutu.annotation.test.SystemLogAnnotation)")
    public void testAnnotationAspect(){
        System.out.println("testAnnotationAspect");
    }
    /**
     * 前置通知
     */
    @Before("execution(* com.leetutu.dao.UserDao.addUser(..))")
    public void before(){
        System.out.println("前置通知....");
    }
    /**
     * 后置通知
     * returnVal:切点方法执行后的返回值
     */
    @AfterReturning(pointcut = "testAnnotationAspect()",returning = "returnVal")
    public void AfterReturning(JoinPoint joinPoint , Object returnVal){
        String params="" ;
        if(joinPoint.getArgs()!=null && joinPoint.getArgs().length>0){
            for (int i = 0; i <joinPoint.getArgs().length ; i++) {
                params=params+ JSONObject.toJSON(joinPoint.getArgs()[i]).toString()+";";
            }
        }
        String returnValue="";
        if(returnVal!=null){
            returnValue =JSONObject.toJSON(returnVal).toString()+";";
        }
        String methodInfo=getMethodInfo(joinPoint);
        System.out.println("调用的方法是："+methodInfo);
        System.out.println("后置通知....返回值："+returnValue);
        System.out.println("后置通知....请求参数："+params);
    }

    /**
     * 环绕通知
     * @param joinPoint 可用于执行切点的类
     */
    @Around("execution(* com.leetutu.dao.UserDao.addUser(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args=joinPoint.getArgs();
        User obj1=(User)args[0];
        System.out.println("环绕通知前....入参是ID是"+obj1.getId()+"姓名是："+obj1.getName());
        Object obj=(Object)joinPoint.proceed();
        System.out.println("环绕通知后....返回值是："+obj.toString());
        return obj;
    }

    /**
     * 抛出通知
     * @param e
     */
    @AfterThrowing(value = "execution(* com.leetutu.dao.UserDao.addUser(..))",throwing = "e")
    public void afterThrowable(Throwable e){
        System.out.println("出现异常：msg="+e.getMessage());
    }

    /**
     * 无论什么情况都会执行的方法
     */
    @After(value="execution(* com.leetutu.dao.UserDao.addUser(..))")
    public void after(){
        System.out.println("最终通知....");
    }

    public static String getMethodInfo(JoinPoint joinPoint){
        String className =joinPoint.getTarget().getClass().getName();
        String methodName=joinPoint.getSignature().getName();
        return  className+"."+methodName;
    }
}
