package com.wayne.state;

public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurity(String str);
    void recordLog(String msg);
}
