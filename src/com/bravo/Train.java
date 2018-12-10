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

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Station[] getStations() {
        return stations;
    }

    public Wagon[] getWagons() {
        return wagons;
    }
}
