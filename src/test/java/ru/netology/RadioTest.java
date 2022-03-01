package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(2);
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldUseNoArgsConstructor() {
        Radio radio = new Radio();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldInitFields() {
        Radio radio = new Radio();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testGetCurrentStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(10);
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio(0);
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
        radio.setCurrentStation(9);

        radio.nextIncreaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testAverageNextIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextIncreaseStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testAveragePrevReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevReduceStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxPrevReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevReduceStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testPrevReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prevReduceStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 11;
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
    public void testSetMaxCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.setToMaxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxIncreaseVolumeUpToOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.nextIncreaseVolumeUpToOne();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeUpToOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.nextIncreaseVolumeUpToOne();

        int expected = 1;
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
        radio.setCurrentVolume(10);

        radio.prevReduceVolumeUpToOne();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}