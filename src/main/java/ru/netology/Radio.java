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
    private int Station;
    private int Volume;
//    int maxVolume = 100;
//    int minVolume = 0;

    public Radio() {

    }

    public Radio(int Station) {

        this.maxStation = Station - 1;
    }

    public int getMaxStation() {

        return this.maxStation;
    }

    public int getMinStation() {

        return this.minStation;
    }

    public int getVolume() {

        return this.Volume;
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

    public void setStation(int Station) {

        if (Station < minStation || Station > maxStation) {
            return;
        }
        this.Station = Station;
    }

    public void nextStation() {

        if (Station >= maxStation) {
            Station = minStation;
        } else {
            Station = Station + 1;
        }
    }

    public void prevStation() {

        if (Station <= minStation) {
            Station = maxStation;
        } else {
            Station = Station - 1;
        }
    }
    public int getStation() {

        return this.Station;
    }

    public void setVolume(int Volume) {

        this.Volume = Volume;
    }

    public void increaseVolume() {

        int maxVolume = 100;
        if (Volume < maxVolume) {
            Volume = Volume + 1;
        } else {
            Volume = maxVolume;
        }
    }

    public void reduceVolume() {

        int minVolume = 0;
        if (Volume > minVolume) {
            Volume = Volume - 1;
        } else {
            Volume = minVolume;
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