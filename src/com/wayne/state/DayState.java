package com.wayne.state;

public class DayState implements State {
    private DayState() {

    }
    private static DayState dayState = new DayState();
    public static DayState getInstance() {
        return dayState;
    }
    public void doClock(Context context, int hour) {
        if (hour < 6 || hour >= 18) {
            //晚上
            context.changeState(NightState.getInstance());
        }
    }
    public void doUse(Context context) {
        context.callSecurity("白天使用");
    }
    public void doAlarm(Context context) {
        context.callSecurity("白天警铃");
    }
    public void doPhone(Context context) {
        context.recordLog("白天打电话");
    }
}
