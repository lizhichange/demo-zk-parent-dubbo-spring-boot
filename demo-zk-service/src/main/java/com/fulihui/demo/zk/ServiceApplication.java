package com.fulihui.demo.zk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author lizhi
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.fulihui"})
@MapperScan(basePackages = {"com.fulihui.prizecore.dal.dao"})
@EnableTransactionManagement
public class ServiceApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ServiceApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
