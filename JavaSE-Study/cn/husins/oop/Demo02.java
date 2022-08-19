package cn.husins.oop;

public class Demo02 {
    // 封装：数据的隐藏，即禁止直接访问一个对象中数据的实际表示，而应通过操作接口来访问，这就成为信息隐藏
    // 代码表示 也就是 属性私有 使用 get/set 方法操作数据


    // 属性私有
    private String name;
    private  int  id;
    private  char sex;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
