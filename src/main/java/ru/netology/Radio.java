package ru.netology;

public class Radio {
private int currentVolume;
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
}