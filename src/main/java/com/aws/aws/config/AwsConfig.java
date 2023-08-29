package com.aws.aws.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsConfig {

    @Value("${secreteManagerName}")
    private String secreteManagerName;
    @Value("${api-key1}")
    private String apiKeyValue1;

    @Value("${api-key2}")
    private String apiKeyValue2;

    @Value("${api-key3}")
    private String apiKeyValue3;

    @PostConstruct
    private void postConstruct() {
//        System.out.println("*************SecretManagerTest");
//        System.out.println(secreteManagerName);
//        System.out.println(apiKeyValue1);
//        System.out.println(apiKeyValue2);
//        System.out.println(apiKeyValue3);
    }
}
