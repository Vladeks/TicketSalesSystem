package com.bravo;

public class Wagon {

    private WagonType wagonType;
    private Place[] places;
    private int freePlaces;

    public Wagon(WagonType wagonType) {
        this.wagonType = wagonType;
        placeFactory(wagonType);
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    private void placeFactory(WagonType type) {
        places = new Place[type.getPlaceCount()];
        freePlaces = type.getPlaceCount();
        for (int i = 0; i < type.getPlaceCount(); i++) {
            places[i] = new Place(i);
        }
    }

}
