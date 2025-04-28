package com.sky;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
public class SkyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkyApplication.class, args);
        log.info("server star<dependency>\n" +
                "    <groupId>com.alibaba</groupId>\n" +
                "    <artifactId>druid-spring-boot-starter</artifactId>\n" +
                "    <exclusions>\n" +
                "        <exclusion>\n" +
                "            <groupId>org.slf4j</groupId>\n" +
                "            <artifactId>slf4j-simple</artifactId>\n" +
                "        </exclusion>\n" +
                "    </exclusions>\n" +
                "</dependency>\nted");
    }
}
