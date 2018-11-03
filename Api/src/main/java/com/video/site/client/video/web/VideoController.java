package com.video.site.client.video.web;

import com.video.site.client.pojo.entity.Movie;
import com.video.site.client.service.MovieService;
import com.video.site.client.vo.VideoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/video")
public class VideoController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MovieService movieService;

    @RequestMapping("/getVideoDetail/pojo")
    public Movie hello(VideoVO videoVO){
        Movie movie = movieService.getMovieById("1");
        logger.info("1");
        logger.debug("1");
        logger.error("1");
        logger.warn("1");
        return movie;
    }

}
