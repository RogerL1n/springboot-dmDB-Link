package com.pck.dmdb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author PCK
 */


@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.pck.dmdb.mapper"})
public class DmdbApplication {

    public static Logger logger = LogManager.getLogger(DmdbApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DmdbApplication.class, args);

    }


}
