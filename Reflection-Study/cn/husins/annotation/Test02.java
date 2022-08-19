package cn.husins.annotation;

/*
元注解：负责注解其他的注解，Java定义了4个标准的meta-annotation类型，他们被用来提供对其他annotation类型的做说明
    四个标准类型：[
            @Target: 用于描述注解可以被用在什么地方
            @Retention: 用于表示需要在什么级别保存该注释，用于描述注解的声明周期 Runtime > Class > source
            @Documented: 用于表示注解是否需要被包含在javadoc中
            @Inherited: 用于表示子类可以继承父类中的被修饰的注解
            ]
 */


import java.lang.annotation.*;

public class Test02 {
    @MyAnnotition
    public void test(){

    }
}


// 定义一个注解

@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface MyAnnotition{
    // 注解的参数：参数类型 + 参数名();  default 后面加默认值
    String name() default "";
    int age() default 0;
    int id() default -1;
    String[] school() default {"清华大学","北京大学"};
}

@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface MyAnnotition1{
    // 默认参数名 为 value 当赋值时 可以省略
   String value();
}


