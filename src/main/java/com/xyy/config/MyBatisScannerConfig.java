//package com.xyy.config;
//
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.context.annotation.Bean;
//
///**
// * MyBatisScannerConfig
// * com.xyy.config
// *
// * @author xiaoyy
// * dao扫描器
// * @Date 2017-05-23 下午6:47
// * The word 'impossible' is not in my dictionary.
// */
//public class MyBatisScannerConfig {
//    @Bean
//    public MapperScannerConfigurer MapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setBasePackage("com.xyy.dao");
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        return mapperScannerConfigurer;
//    }
//}
