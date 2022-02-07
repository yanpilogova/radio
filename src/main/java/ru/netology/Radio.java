package ru.netology;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        {
            if (newCurrentStation < 0) {
                return;
            }
            if (newCurrentStation > 9) {
                return;
            }
            this.currentStation = newCurrentStation;
        }
    }

    public void setToMaxStation() {
        {
            currentStation = 9;
        }
    }

    public void nextIncreaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prevReduceStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = currentStation + 9;
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        {
            if (newCurrentVolume < 0) {
                return;
            }
            if (newCurrentVolume > 10) {
                return;
            }
            this.currentVolume = newCurrentVolume;
        }
    }

    public void setToMaxVolume() {
        {
            currentVolume = 10;
        }
    }

    public void nextIncreaseVolumeUpToOne() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume =currentVolume + 0;
        }

    }

    public void prevReduceVolumeUpToOne() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume - 0;
        }
    }
}
