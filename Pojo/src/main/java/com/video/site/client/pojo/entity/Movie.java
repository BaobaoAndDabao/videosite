package com.video.site.client.pojo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "电影对象")
public class Movie {

    @ApiModelProperty(value = "电影ID", name = "id")
    private String id;
    @ApiModelProperty(value = "播放地址", name = "playUrl")
    private String playUrl;
    @ApiModelProperty(value = "电影名称", name = "name")
    private String name;
    @ApiModelProperty(value = "导演名称", name = "author")
    private String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
