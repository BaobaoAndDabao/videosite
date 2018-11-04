package com.video.site.client.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="/test", tags="测试模块接口")
@RestController
@RequestMapping("/test")
public class TestController implements InitializingBean {

    @Autowired
    private Environment environment;
//InitializingBean
    @ApiOperation(value="测试服务正常", notes = "测试服务正常")
    @GetMapping("/hello")
    public String hello(){
        String[] activeProfiles = environment.getActiveProfiles();
        return "hello, I'm OK in the "+activeProfiles[0].toString();
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        String[] activeProfiles = environment.getActiveProfiles();
      //  System.err.println(C);
    }
}
