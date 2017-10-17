package com.jlk.lll;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Holleworld2 extends ActionSupport implements ModelDriven<Userinfo>{
    public Userinfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(Userinfo userinfo) {
        this.userinfo = userinfo;
    }

    private Userinfo userinfo= new Userinfo();

    public String getHello() throws Exception {
        System.out.println("com.jlk.lll.Holleworld" +userinfo.getName()
                            + "   " +userinfo.getAge());
        return "success";
    }

    @Override
    public Userinfo getModel() {
        return userinfo;
    }
}
