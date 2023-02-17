package com.wayne.composite;

import java.util.ArrayList;
import java.util.List;
//组合对象
public class Composite extends Component{
    /**
     * 示意属性，组件的名字
     */
    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    /**
     * 用来存储组合对象中包含的子组件对象
     */
    private List<Component> childComponents = null;

    /**
     * 示意方法，此处用于输出组件的树形结构，通常在里面需要实现递归的调用
     */
    @Override
    public void someOperation(String preStr) {
        // 先把自己输出
        System.out.println(preStr + "+" + name);
        // 如果还包含其他子组件，那么就输出这些子组件对象
        if (null != childComponents) {
            // 添加一个空格，表示向后缩进一个空格
            preStr += "   ";
            // 输出当前对象的子组件对象
            for (Component component : childComponents) {
                // 递归地进行子组件相应方法的调用，输出每个子组件对象
                component.someOperation(preStr);
            }
        }

    }

    /**
     * 向组合对象中添加组件对象
     */
    public void addChild(Component child) {
        // 延迟初始化
        if (null == childComponents) {
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(child);
    }

    /**
     * 从组合对象中移除组件对象
     */
    public void removeChild(Component child) {
        if (null != childComponents) {
            childComponents.remove(child);
        }
    }

    /**
     * 根据索引获取组合对象中对应的组件对象
     */
    public Component getChildren(int index) {
        if (null != childComponents) {
            if (index >= 0 && index < childComponents.size()) {
                return childComponents.get(index);
            }
        }
        return null;
    }
}
