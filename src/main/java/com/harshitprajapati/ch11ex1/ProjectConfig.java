package com.harshitprajapati.ch11ex1;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.harshitprajapati.ch11ex1")
public class ProjectConfig {
}
