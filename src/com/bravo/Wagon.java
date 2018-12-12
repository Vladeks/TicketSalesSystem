package com.bravo;

public class Wagon {

    enum WagonType {
        PLACKART(54), KUPE(36), LUX(18);
        private int placeCount;

        WagonType(int placeCount) {
            this.placeCount = placeCount;
        }

        public int getPlaceCount() {
            return placeCount;
        }
    }

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
