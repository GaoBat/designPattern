package com.wayne.prototype;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        AbstractSpoon spoon = new SoupSpoon();
        AbstractSpoon spoon2 = (AbstractSpoon) spoon.clone();
        System.out.println(spoon==spoon2);
    }
}
