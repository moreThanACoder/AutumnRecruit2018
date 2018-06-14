package com.wangrupeng.jianzhioffer.question_2;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;
    private LazyInitializationSingleton() {}

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}