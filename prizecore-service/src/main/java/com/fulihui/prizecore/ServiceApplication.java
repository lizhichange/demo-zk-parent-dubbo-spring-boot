package com.fulihui.prizecore;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author lizhi
 */
@SpringBootApplication
public class ServiceApplication {


    public static void main(String[] args) {

        new SpringApplicationBuilder(ServiceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

    }
}
