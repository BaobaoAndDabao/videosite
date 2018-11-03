package com.video.site.client.service;

import com.video.site.client.dao.MovieMapper;
import com.video.site.client.pojo.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements  MovieService{

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public Movie getMovieById(String id){
        return movieMapper.getMovieById(id);
    }
}
