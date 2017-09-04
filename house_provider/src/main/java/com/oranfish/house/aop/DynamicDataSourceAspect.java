package com.oranfish.house.aop;

import com.oranfish.house.annotation.Datasource;
import com.oranfish.house.datasource.DataSourceContextHolder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Order(-1) // 保证该AOP在@Transactional之前执行
@Component
public class DynamicDataSourceAspect {

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


    @After("@annotation(datasource)")
    public void afterSwitch(JoinPoint point, Datasource datasource){

        DataSourceContextHolder.clearDB();

    }

}
