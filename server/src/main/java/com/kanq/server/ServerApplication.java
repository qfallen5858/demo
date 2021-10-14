package com.kanq.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务端启动类
 */
@SpringBootApplication(scanBasePackages = {"com.kanq"})
public class ServerApplication {

    private final static Logger logger = LoggerFactory.getLogger(ServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        logger.info("ServerApplication start...");
    }
}
