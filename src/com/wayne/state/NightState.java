package com.wayne.state;

public class NightState implements State {
    private NightState(){

    }
    private static NightState nightState = new NightState();

    public static NightState getInstance() {
        return nightState;
    }

    public void doClock(Context context, int hour) {
        if (hour >= 6 && hour < 18) {
            //白天
            context.changeState(DayState.getInstance());
        }
    }

    public void doUse(Context context) {
        context.callSecurity("晚上使用");
    }

    public void doAlarm(Context context) {
        context.callSecurity("晚上警铃");
    }

    public void doPhone(Context context) {
        context.recordLog("晚上打电话");
    }
}
