package com.bravo;

public class Train {
    private String number;
    private String name;
    private TrainStop[] stops;
    private Wagon[] wagons;

    public Train(String number, String name, TrainStop[] stations, Wagon[] wagons) {
        this.number = number;
        this.name = name;
        this.stops = stations;
        this.wagons = wagons;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public TrainStop[] getStops() {
        return stops;
    }

    public Wagon[] getWagons() {
        return wagons;
    }
}
