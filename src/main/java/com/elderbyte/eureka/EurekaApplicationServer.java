package com.elderbyte.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Entry point of the Eureka Service Discovery Server
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationServer {

    private static final Logger log = LoggerFactory.getLogger(EurekaApplicationServer.class);

    public static void main(String[] args) throws UnknownHostException {
        ApplicationContext ctx = SpringApplication.run(EurekaApplicationServer.class, args);

        Environment env = ctx.getEnvironment();
        log.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "External: \thttp://{}:{}\n----------------------------------------------------------",
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }

}

