//package com.tpg.configserver.configuration;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//@Configuration
//@ConfigurationProperties("spring.datasource")
//@SuppressWarnings("unused")
//public class DBConfiguration {
//    private String driveClassName;
//    private String url;
//    private String username;
//    private String password;
//
//    private static final Logger logger = LoggerFactory.getLogger(DBConfiguration.class);
//
//    @Profile("qa")
//    @Bean
//    public String qaDatabaseConnection(){
//        logger.info("DB Connection for QA Env -H2");
//        logger.info(driveClassName);
//        logger.info(url);
//        return "DB Connection Return";
//    }
//
//    @Profile("dev")
//    @Bean
//    public String devDatabaseConnection(){
//        logger.info("DB Connection for DEV Env -H2");
//        logger.info(driveClassName);
//        logger.info(url);
//        return "DB Connection Return";
//    }
//
//    @Profile("prod")
//    @Bean
//    public String prodDatabaseConnection(){
//        logger.info("DB Connection for Prod Env -H2");
//        logger.info(driveClassName);
//        logger.info(url);
//        return "DB Connection Return";
//    }
//
//}
