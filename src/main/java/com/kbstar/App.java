package com.kbstar;

public class App {
    public static void main(String[] args) {
        STV tv = new STV();  // 여기를 만약에 LTV로 바꾼다고 했을때 밑에 turnOn에 빨간줄이 뜨게 됨 -> 시스템의 유연성이 떨어짐
        tv.turnOn();

        // LTV tv = new LTV();
        // tv.turnon();
    }
}
