package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import jakarta.persistence.Column;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private Double score;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {

    }

    public GameMinDTO(Game entity) { //Copiando os dados do "Game" para DTO
        title = entity.getTitle(); //Não precisa do "this" pois não tem mais valores repetidos
        shortDescription = entity.getShortDescription();
        imgUrl = entity.getImgUrl();
        year = entity.getYear();
        id = entity.getId();
    }

    public GameMinDTO(GameMinProjection projection) { //Copiando os dados do "Game" para DTO
        title = projection.getTitle(); //Não precisa do "this" pois não tem mais valores repetidos
        shortDescription = projection.getShortDescription();
        imgUrl = projection.getImgUrl();
        year = projection.getYear();
        id = projection.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
