package com.burak.inner_and_static.StaticKeyword;

public class Audience {

    String name;

    public static int audienceNum = 0;
    private static int privAudienceNum = 0;

    public Audience(String name) {
        this.name = name;

        audienceNum++;
        privAudienceNum++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void watchShow() {
        System.out.println(name + " watching show");
    }

    public static int getPrivAudienceNum() {
        return privAudienceNum;
    }
}
