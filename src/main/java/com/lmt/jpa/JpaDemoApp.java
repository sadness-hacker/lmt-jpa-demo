package com.lmt.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description 启动类
 *
 * @author bazhandao
 * @date 2022/1/16 16:03
 * @since JDK1.8
 */
@SpringBootApplication
@EnableTransactionManagement
public class JpaDemoApp {

    public static void main(String [] args) {
        SpringApplication.run(JpaDemoApp.class, args);
    }


}
