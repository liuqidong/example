package com.example.user;

import com.example.springboot.WebServerAutoConfiguration;
import com.example.springboot.ZhouyuSpringApplication;
import com.example.springboot.ZhouyuSpringBootApplication;
import org.springframework.context.annotation.Import;

@ZhouyuSpringBootApplication
public class MyApplication { // spring.factories

    public static void main(String[] args) {
        ZhouyuSpringApplication.run(MyApplication.class);
    }
}
