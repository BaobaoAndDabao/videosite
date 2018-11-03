package com.video.site.client;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.video.site.client.dao.**")
public class VideoSiteApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(VideoSiteApplication.class, args);
    }

}
