package com.myapplicationdev.android.tw_listview;

public class Module {
    private String code;
    private boolean com;
    public Module(String code, boolean com) {
        this.code = code;
        this.com = com;
    }
    public String getName() {
        return code;
    }
    public boolean isCom() {
        return com;
    }

}
