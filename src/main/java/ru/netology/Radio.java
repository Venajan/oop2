package ru.netology;

public class Radio {

    private int maxStation = 9;
    private final int minStation = 0;
    private int currentStation;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int currentStation) {

        maxStation = currentStation - 1;
    }


    public int getMaxStation() {

        return maxStation;
    }

    public int getMinStation() {

        return minStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

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

    public int getCurrentVolume() {

        return currentVolume;
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

}