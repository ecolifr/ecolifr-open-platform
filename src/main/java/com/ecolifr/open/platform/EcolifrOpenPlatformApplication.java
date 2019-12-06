package com.ecolifr.open.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 认证服务器，用于获取 Token
 *
 * @author ecolifr
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ecolifr.open.platform.server.mapper")
public class EcolifrOpenPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcolifrOpenPlatformApplication.class, args);
    }

}
