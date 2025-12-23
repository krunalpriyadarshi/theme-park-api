package com.krunal.themepark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThemeParkApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        System.out.println(RideStatusService.getRideStatus("teacup"));
        SpringApplication.run(ThemeParkApplication.class);
    }
}
