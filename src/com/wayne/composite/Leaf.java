package com.wayne.composite;

public class Leaf extends Component{
    /**
     * 示意属性，组件的名字
     */
    private String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    /**
     * 示意方法，此处用于输出组件的树形结构
     */
    @Override
    public void someOperation(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
