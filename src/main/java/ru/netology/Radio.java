package ru.netology;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import java.util.Objects;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data


public class Radio {
    private int maxStation = 9;
    private final int minStation = 0;
    private int currentStation;
    private int currentVolume;
//    int maxVolume = 100;
//    int minVolume = 0;

    public Radio() {

    }

    public Radio(int currentStation) {

        this.maxStation = currentStation - 1;
    }

    public int getMaxStation() {

        return this.maxStation;
    }

    public int getMinStation() {

        return this.minStation;
    }

    public int getCurrentVolume() {

        return this.currentVolume;
    }

//    public int getMaxVolume() {
//
//        return this.maxVolume;
//    }

//    public int getMinVolume() {
//
//        return this.minVolume;
//    }

//    public void setMaxStation(int maxStation) {
//
//        this.maxStation = maxStation;
//    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {

        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {

        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }
    public int getCurrentStation() {

        return this.currentStation;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {

        int maxVolume = 100;
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {

        int minVolume = 0;
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

//    public void setMaxVolume(int maxVolume) {
//
//        this.maxVolume = maxVolume;
//    }

//    public void setMinVolume(int minVolume) {
//
//        this.minVolume = minVolume;
//    }

}