package com.video.site.client.web;

import com.video.site.client.pojo.entity.Movie;
import com.video.site.client.service.MovieService;
import com.video.site.client.vo.VideoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value="/video", tags="视频模块接口")
@RestController
@RequestMapping("/video")
public class VideoController {

    Logger logger = LoggerFactory.getLogger(getClass());

 @Autowired
    private MovieService movieService;

    @ApiOperation(value="demo", notes="demo")
    @GetMapping("/getVideoDetail/pojo")
    public Movie hello(VideoVO videoVO){
        Movie movie = movieService.getMovieById("1");
        logger.info("1");
        logger.debug("1");
        logger.error("1");
        logger.warn("1");
        return movie;
    }
    @ApiOperation(value="查询电影详情", notes="根据电影id查询电影详情")
    @ApiImplicitParam(name = "id", value = "电影id", required = true, dataType = "String",defaultValue="1")
    @GetMapping("/getVideoDetail")
    public Movie getVideoDetail(@RequestParam(defaultValue = "1") String id){
        Movie movie = movieService.getMovieById(id);
        return movie;
    }

}
