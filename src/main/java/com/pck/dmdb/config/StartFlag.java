package com.pck.dmdb.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: dmdb
 * @description: 启动标志
 * @author: Pck
 * @create: 2022-08-27 23:38
 **/

@Component
@Order(1)
@Slf4j
public class StartFlag implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        StartFlag.log.info("启动成功!");
    }
}
