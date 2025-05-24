package com.devsuperior.dslist.entites.dto;

import jakarta.persistence.Column;

public class GameFullDTO {
    private Long idGame;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgURL;
    private String shortDescription;
    private String longDescription;

    public GameFullDTO() {
    }

    public GameFullDTO(Long idGame, String title, Integer year, String genre, String platforms,
                       Double score, String imgURL, String shortDescription, String longDescription) {
        this.idGame = idGame;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgURL = imgURL;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getIdGame() {
        return idGame;
    }

    public void setIdGame(Long idGame) {
        this.idGame = idGame;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
