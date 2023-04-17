package com.kbstar.app;

import com.kbstar.frame.*;  // 여기 있는 모든 클래스 임포트
import com.kbstar.tv.*;

public class App {
    public static void main(String[] args) {
        TV tv = new LTV();  // LTV를 STV로만 바꾸면 바로 작동!
        
        tv.turnOn();
    }
}
