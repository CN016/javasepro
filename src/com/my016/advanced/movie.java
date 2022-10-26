package com.my016.advanced;

public class movie {
    private  double evaluateScore;
    private   date beShowedDate;
    private  String name;
    private   String director;
    private  String placeOfOrigin;
    private  String officialWebsite;

    public movie() {
    }

    public movie(double evaluateScore, date beShowedDate, String name, String director, String placeOfOrigin, String officialWebsite) {
        this.evaluateScore = evaluateScore;
        this.beShowedDate = beShowedDate;
        this.name = name;
        this.director = director;
        this.placeOfOrigin = placeOfOrigin;
        this.officialWebsite = officialWebsite;
    }

    public double getEvaluateScore() {
        return evaluateScore;
    }

    public void setEvaluateScore(double evaluateScore) {
        this.evaluateScore = evaluateScore;
    }

    public date getBeShowedDate() {
        return beShowedDate;
    }

    public void setBeShowedDate(date beShowedDate) {
        this.beShowedDate = beShowedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getOfficialWebsite() {
        return officialWebsite;
    }

    public void setOfficialWebsite(String officialWebsite) {
        this.officialWebsite = officialWebsite;
    }
}
