package com.wayne.memento;

import java.io.File;
import java.io.Serializable;
//可见memento中保存了originator中的number和file值,通过
//调用orginator中的number和file值改变的话,通过调用setMemento()可以恢复
//缺点耗费大,如果内部状态很多再保存一份无疑要浪费大量内存
public class Memento implements Serializable {
    private int number;
    private File file;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Memento(Originator o) {
        number=o.getNumber();
        file=o.getFile();
    }
}
