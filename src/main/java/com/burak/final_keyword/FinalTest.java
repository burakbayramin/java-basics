package com.burak.final_keyword;

public class FinalTest {

    public final int objectNum;
    public static int num = 0;
    public final String name;

    public FinalTest(String name) {
        this.name = name;
        num++;
        this.objectNum = num;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        FinalTest.num = num;
    }
}
