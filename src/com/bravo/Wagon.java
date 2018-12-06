package com.bravo;

public class Wagon {

    enum WagonType {PLACKART, KUPE, LUX}

    private WagonType wagonType;
    private Place[] places;
    private int freePlaces;

    public Wagon(WagonType wagonType, Place[] places) {
        this.wagonType = wagonType;
        this.places = places;
        countFreePlaces();
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    private void countFreePlaces() {
        if(places != null || places.length != 0) {
            for (Place place: places) {
                if (place.isFree()) {
                    freePlaces++;
                }
            }
        } else {
            freePlaces = 0;
        }

    }

}
