package cn.husins.base;

/**
 * @author husins
 * @version 1.0
 * @since 1.8
 * */
public class Doc {
    String name;

    /**
     * @param name
     * @return
     */
    public String test(String name){
        return name;
    }

}

// javadoc -encoding UTF-8 -charset UTF-8 Doc.java 生成doc文档