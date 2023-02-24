package com.wayne.memento;

import java.io.File;
//备忘录模式:
//memento是保存另外一个对象内部状态拷贝的对象,这样以后就可以将该对象恢复到原先保存的状态
public class Originator {
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

    //创建一个memento
    public Memento getMemento(){
        return new Memento(this);
    }
    //恢复到原始值
    public void setMemento(Memento m){
        number = m.getNumber();
        file=m.getFile();
    }
}
