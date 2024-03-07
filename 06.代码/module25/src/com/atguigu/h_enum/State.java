package com.atguigu.h_enum;

public enum State {
    //State WEIFUKUAN = new State()
    //State WEIFUKUAN = new State("未付款")
    WEIFUKUAN("未付款"),
    //State YIFUKUAN = new State()
    //State YIFUKUAN = new State("已付款")
    YIFUKUAN("已付款"),
    //State WEIFAHUO = new State()
    //State WEIFAHUO = new State("未发货")
    WEIFAHUO("未发货"),
    //State YIFAHUO = new State()
    //State YIFAHUO = new State("已发货")
    YIFAHUO("已发货");

    private String name;

    private State() {

    }

    State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
