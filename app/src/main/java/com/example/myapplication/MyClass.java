package com.example.myapplication;

import androidx.annotation.Nullable;

public class MyClass {
    private Integer age;
    private String name;

    MyClass(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }
}


