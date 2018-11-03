package com.video.site.client.video.web;

import com.video.site.client.pojo.entity.Movie;
import com.video.site.client.service.MovieService;
import com.video.site.client.vo.VideoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("/getVideoDetail/pojo")
    public Movie hello(VideoVO videoVO){
        Movie movie = movieService.getMovieById("1");
        return movie;
    }

}
