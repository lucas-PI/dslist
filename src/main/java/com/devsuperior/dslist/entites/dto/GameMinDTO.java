package com.devsuperior.dslist.entites.dto;

public class GameMinDTO {
    private Long idGame;
    private String title;
    private Integer year;
    private String imgURL;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Long idGame, String title, Integer year, String imgURL, String shortDescription) {
        this.idGame = idGame;
        this.title = title;
        this.year = year;
        this.imgURL = imgURL;
        this.shortDescription = shortDescription;
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
}
