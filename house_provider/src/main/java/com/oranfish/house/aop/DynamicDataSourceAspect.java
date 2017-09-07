package com.oranfish.house.aop;

import com.oranfish.house.annotation.Datasource;
import com.oranfish.house.datasource.DataSourceContextHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(-1) // 保证该AOP在@Transactional之前执行
@Component
public class DynamicDataSourceAspect {

    @Pointcut("execution(* com.oranfish.house.service.*.*(..))")
    private void dataSourcePointCut(){}

    @Before("dataSourcePointCut()")
    public void beforeService(JoinPoint point){
        //获得当前访问的class
        Class<?> className = point.getTarget().getClass();
        Datasource annotation = className.getAnnotation(Datasource.class);
        if(annotation != null && annotation.value() != null){
            DataSourceContextHolder.setDB(annotation.value());
        }
    }

    @After("dataSourcePointCut()")
    public void afterService(){
        DataSourceContextHolder.clearDB();
    }

    @Before("@annotation(datasource)")
    public void beforeSwitch(JoinPoint point, Datasource datasource){
//        //获得当前访问的class
//        Class<?> className = point.getTarget().getClass();
//        //获得访问的方法名
//        String methodName = point.getSignature().getName();
//        //得到方法的参数的类型
//        Class[] argClass = ((MethodSignature)point.getSignature()).getParameterTypes();
//        String dataSource = DataSourceContextHolder.DEFAULT_DS;
//        try {
//            // 得到访问的方法对象
//            Method method = className.getMethod(methodName, argClass);
//
//            // 判断是否存在注解
//            if (method.isAnnotationPresent(Datasource.class)) {
//                Datasource annotation = method.getAnnotation(Datasource.class);
//                // 取出注解中的数据源名
//                dataSource = annotation.value();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // 切换数据源
//        DataSourceContextHolder.setDB(dataSource);
        DataSourceContextHolder.setDB(datasource.value());
    }

}
