package com.bravo;

import java.util.ArrayList;
import java.util.List;

public class Bookonig {

    private Timetable timetable;

    public Bookonig(Timetable timetable) {
        this.timetable = timetable;
    }

    public List<Train> findTrains(String from, String to) {
        List<Train> allowTrains = new ArrayList<>();
        for (Train train: timetable.getTrains()) {
            TrainStop[] stops = train.getStops();
            for (int i = 0; i < stops.length; i++) {
                if(stops[i].getName().equals(from)) {
                    for (int j = i; j < stops.length; j++) {
                        if(stops[j].getName().equals(to)) {
                            allowTrains.add(train);
                        }
                    }
                }
            }
        }
        return allowTrains;
    }

    public List<Wagon> findWagonWithFreePlaces(List<Train> trains) {
        List<Wagon> allowWagons = new ArrayList<>();
        for (Train train : trains) {
            for (Wagon wagon : train.getWagons()) {
                if(wagon.getFreePlaces() > 0) {
                    allowWagons.add(wagon);
                }
            }
        }
        return  allowWagons;
    }


}
