package com.bravo;

public class Wagon {

    enum WagonType {PLACKART, KUPE, LUX}

    private WagonType wagonType;
    private Ticket[] places;
    private int freePlaces;

    public Wagon(WagonType wagonType, Ticket[] places) {
        this.wagonType = wagonType;
        this.places = places;
        countFreePlaces();
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    private void countFreePlaces() {
        if(places != null || places.length != 0) {
            for (Ticket place: places) {
                if (place.isFree()) {
                    freePlaces++;
                }
            }
        } else {
            freePlaces = 0;
        }

    }

}
