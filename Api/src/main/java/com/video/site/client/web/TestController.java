package com.video.site.client.web;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController implements InitializingBean {

    @Autowired
    private Environment environment;
//InitializingBean
    @RequestMapping("/hello")
    public String hello(){

        String[] activeProfiles = environment.getActiveProfiles();

        return activeProfiles[0].toString();
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        String[] activeProfiles = environment.getActiveProfiles();
      //  System.err.println(C);
    }
}
