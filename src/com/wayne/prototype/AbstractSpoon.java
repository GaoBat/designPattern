package com.wayne.prototype;

//原型模式定义:
//用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象
//Prototype模式允许一个对象再创建另外一个可定制的对象,根本无需知道任何如何创建的细节,工作原理:
//通过将一个原型对象传给那个要发动创建的对象,这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建
//如何使用
//因为java中的提供clone()来实现对象的克隆,所以prototype模式实现一下子变得很简单

public abstract class AbstractSpoon implements Cloneable{
    String spoonName;

    public String getSpoonName() {
        return spoonName;
    }

    public void setSpoonName(String spoonName) {
        this.spoonName = spoonName;
    }

    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        }catch (CloneNotSupportedException exception){
            System.err.println("AbstraxtSpoon is not Cloneable");
        }
        return object;
    }

}
