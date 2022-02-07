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
    public void setToMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.setToMaxStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.nextIncreaseStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    @Test
    public void prevReduceStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.prevReduceStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
}