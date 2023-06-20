package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data


public class Radio {
    int maxStation = 9;
    int minStation = 0;
    int Station;
    int Volume;
    int maxVolume = 100;
    int minVolume = 0;

    public Radio(int NewStation) {
        this.Station = NewStation;
        maxStation = NewStation - 1;
    }

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

    public void increaseVolume() {

        if (Volume < maxVolume) {
            Volume = Volume + 1;
        } else {
            Volume = maxVolume;
        }
    }

    public void reduceVolume() {

        if (Volume > minVolume) {
            Volume = Volume - 1;
        } else {
            Volume = minVolume;
        }
    }
}