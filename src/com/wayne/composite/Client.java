package com.wayne.composite;
//组合模式是一种对象的行为模式.将对象组合成树形结构以表示'部分-整体'的层次结构.
//组合模式使得用户对单个对象和组合对象的使用具有一致性
//组合模式的本质:统一叶子对象和组合对象
//组合模式的目的:让客户端不再区分操作的是组合对象还是叶子对象,而是以一个统一的方式来操作
//组合模式涉及的角色及其职责如下:
//抽象组件(component)角色:为组合对象和叶子对象声明公共的接口,让客户端可以通过这个接口来访问和管理整个对象树,并可以为这些定义的接口提供缺省的实现。
//组合对象(composite)角色:通常会存储子组件(组合对象、叶子对象),定义包含子组件的那些组件的行为,并实现在抽象组件中定义的与子组件有关的操作,例如子组件的添加(addChild)和删除(removeChild)等。
//叶子对象(leaf)角色:定义和实现叶子对象的行为,并且它不再包含其他的子节点对象。
//客户端(client)角色:通过component接口来统一操作组合对象和叶子对象,以创建出整个对象树结构
public class Client {
    public static void main(String[] args) {
        // 定义多个Composite组合对象
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");
        Component c3 = new Composite("母婴");

        // 定义多个Leaf叶子对象
        Component leaf1 = new Leaf("西服");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("衬衫");
        Component leaf4 = new Leaf("裙子");
        Component leaf5 = new Leaf("套装");
        Component leaf6 = new Leaf("鞋袜");
        Component leaf7 = new Leaf("孕妇装");
        Component leaf8 = new Leaf("婴儿装");

        // 组合成为树形的对象结构
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(leaf6);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c1.addChild(leaf3);
        c2.addChild(leaf4);
        c2.addChild(leaf5);
        c2.addChild(c3);
        c3.addChild(leaf7);
        c3.addChild(leaf8);

        // 调用根对象的输出功能输出整棵树
        root.someOperation("");
    }
}
