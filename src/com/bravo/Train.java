package com.bravo;

public class Train {
    private String number;
    private String name;
    private Station[] stations;
    private Wagon[] wagons;

    public Train(String number, String name, Station[] stations, Wagon[] wagons) {
        this.number = number;
        this.name = name;
        this.stations = stations;
        this.wagons = wagons;
    }
}
