package org.zerock.ex01;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex01Application {

    public static void main(String[] args) {
        SpringApplication.run(Ex01Application.class, args);
    }

    @Test
    void contextLoads(){
        System.out.println("contextLoads...");
    }

}
