package com.digitaltouchlab.learntangale;

/**
 * Created by salabs on 15/07/2017.
 */

public class Word {
    // define members variables
    private String tangaleTranlation;
    private String englishTranlation;
    private String hausaTranlation;


    // define constructor
    public Word(String tangaleTranlation, String englishTranlation, String hausaTranlation) {
        this.tangaleTranlation = tangaleTranlation;
        this.englishTranlation = englishTranlation;
        this.hausaTranlation = hausaTranlation;

    }

    public Word() {
    }

    // define getters
    public String getTangaleTranlation() {
        return tangaleTranlation;
    }

    public String getEnglishTranlation() {
        return englishTranlation;
    }

    public String getHausaTranlation() {
        return hausaTranlation;
    }


}
