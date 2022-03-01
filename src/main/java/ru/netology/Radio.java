package ru.netology;

public class Radio {
    private int currentStation = 9;
    private int currentVolume;


    public Radio() {
    }

    public Radio(
            int currentStation
    ) {
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setToMaxStation() {
        {
            currentStation = 9;
        }
    }

    public void nextIncreaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevReduceStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        {
            if (newCurrentVolume < 0) {
                return;
            }
            if (newCurrentVolume > 100) {
                return;
            }
            this.currentVolume = newCurrentVolume;
        }
    }

    public void setToMaxVolume() {
        {
            currentVolume = 100;
        }
    }

    public void nextIncreaseVolumeUpToOne() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void prevReduceVolumeUpToOne() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}
