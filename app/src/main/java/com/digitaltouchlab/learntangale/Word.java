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


    // define constructor
    public Word(String tangaleTranlation, String englishTranlation, String hausaTranlation, int wordImageId) {
        this.tangaleTranlation = tangaleTranlation;
        this.englishTranlation = englishTranlation;
        this.hausaTranlation = hausaTranlation;
        this.wordImageId = wordImageId;

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




}
