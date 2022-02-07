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
            currentStation = currentStation - 9;
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
//
//
//
////    public void increase30p() {
////        currentStation =  130 * currentStation / 100;
////    }
//    //private int soundVolume;
//
//}
}