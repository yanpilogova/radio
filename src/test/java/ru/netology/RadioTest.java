package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testGetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(100);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setToMaxStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void testNextIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextIncreaseStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testAverageNextIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.nextIncreaseStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxNextIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextIncreaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevReduceStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testAveragePrevReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prevReduceStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxPrevReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.prevReduceStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.setToMaxVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextIncreaseVolumeUpToOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.nextIncreaseVolumeUpToOne();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testAverageIncreaseVolumeUpToOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.nextIncreaseVolumeUpToOne();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevReduceVolumeUpToOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevReduceVolumeUpToOne();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testAveragePrevReduceVolumeUpToOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.prevReduceVolumeUpToOne();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}