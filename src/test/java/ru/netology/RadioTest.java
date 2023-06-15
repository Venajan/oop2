package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldChangeValidStation() {

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangeNotValidPositiveStation() {

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldChangeNotValidNegativeStation() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation() {

        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldEqualMaxStation() {

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {

        radio.setCurrentStation(4);
        radio.prevStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldEqualMinStation() {

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {

        radio.setCurrentVolume(90);
        radio.increaseVolume();

        int expected = 91;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldEqualMaxVolume() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldUnderMaxVolume() {

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceVolume() {

        radio.setCurrentVolume(60);
        radio.reduceVolume();

        int expected = 59;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldEqualMinVolume() {

        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldUnderMinVolume() {

        radio.setCurrentVolume(-1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

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
        Radio radio = new Radio(5);

        int expected = 4;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCreateStationsWithLimits3() {
        Radio radio = new Radio(50);

        int expected = 49;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCreateStationsWithLimits4() {
        Radio radio = new Radio(30);

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

}