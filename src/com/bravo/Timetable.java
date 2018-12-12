package com.bravo;

import java.util.List;

public class Timetable {

    private List<Train> trains;

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public boolean addTrain(Train train) {
        return trains.add(train);
    }
}


