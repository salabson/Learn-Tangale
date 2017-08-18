package com.digitaltouchlab.learntangale;

/**
 * Created by salabs on 15/07/2017.
 */

public class Word {
    // define members variables
    private String tangaleTranlation;
    private String englishTranlation;
    private String hausaTranlation;
    private int wordImageId;
    private String isAddedToFavorite;


    // define constructor
    public Word(String tangaleTranlation, String englishTranlation, String hausaTranlation, int wordImageId, String isAddedToFavorite) {
        this.tangaleTranlation = tangaleTranlation;
        this.englishTranlation = englishTranlation;
        this.hausaTranlation = hausaTranlation;
        this.wordImageId = wordImageId;
        this.isAddedToFavorite = isAddedToFavorite;

    }

    public Word() {
    }

    // define getters
    public String getTangaleTranlation() {
        return this.tangaleTranlation;
    }

    public String getEnglishTranlation() {
        return this.englishTranlation;
    }

    public String getHausaTranlation() {
        return hausaTranlation;
    }

    public int getwordImageId() {
        return this.wordImageId;
    }

    public String getIsAddedToFavorit() {
        return isAddedToFavorite;
    }

    // define setters
    public void setTangaleTranlation(String tangaleTranlation) {
        this.tangaleTranlation = tangaleTranlation;
    }

    public void setEnglishTranlation(String englishTranlation) {
        this.englishTranlation = englishTranlation;
    }

    public void setHausaTranlation(String hausaTranlation) {
        this.hausaTranlation = hausaTranlation;
    }

    public void setWordImageId(int wordImageId) {
        this.wordImageId = wordImageId;
    }

    public void setAddedToFavorite(String addedToFavorite) {
        isAddedToFavorite = addedToFavorite;
    }
}
