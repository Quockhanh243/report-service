package com.mor.service.common.reportservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "report-service")
@EnableDiscoveryClient
public class ReportServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReportServiceApplication.class, args);
  }

}
