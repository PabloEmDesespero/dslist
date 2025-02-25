package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.fasterxml.jackson.databind.util.BeanUtil;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

import java.util.Optional;

public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
//        this.id = entity.getId();
//        this.title = entity.getTitle();
//        this.year = entity.getYear();
//        this.genre = entity.getGenre();
//        this.platforms = entity.getPlatforms();
//        this.score = entity.getScore();
//        this.imgUrl = entity.getImgUrl();
//        this.shortDescription = entity.getShortDescription();
//        this.longDescription = entity.getLongDescription();
    }

        public GameDTO(Optional<Game> result) {
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    //constructor that returns the entity

}

//
