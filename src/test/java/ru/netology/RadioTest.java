package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldSetStation1() {

        radio.setStation(5);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStation2() {

        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStation3() {

        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation1() {

        radio.setStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldEqualMaxStation() {

        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {

        radio.setStation(4);
        radio.prevStation();

        int expected = 3;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldEqualMinStation() {

        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {

        radio.setVolume(90);
        radio.increaseVolume();

        int expected = 91;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldEqualMaxVolume() {

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldUnderMaxVolume() {

        radio.setVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolume() {

        radio.setVolume(60);
        radio.reduceVolume();

        int expected = 59;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldEqualMinVolume() {

        radio.setVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldUnderMinVolume() {

        radio.setVolume(-1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCreateStationsWithLimits1() {

        Radio radio = new Radio(1);

        int expected = 0;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCreateStationsWithLimits2() {
        Radio radio = new Radio(50);

        int expected = 49;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCreateStationsWithLimits3() {
        Radio radio = new Radio(10);

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }
}