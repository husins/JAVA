package cn.husins.annotation;


import java.util.ArrayList;

public class Test01 extends Object {
    public static void main(String[] args) {

    }


    // @Override 他是重写注解，注解不是必须的
    @Override
    public String toString() {
        return "Test01{}";
    }


    // @Deprecated 他是弃用注解，被该注解修饰，不建议使用,但是可以使用
    @Deprecated
    public void test(){

    }

    // @SuppressWarnings 抑制警告，可以放入参数
    @SuppressWarnings("all")
    public void test02(){
        ArrayList<Object> objects = new ArrayList<>();
    }
}
