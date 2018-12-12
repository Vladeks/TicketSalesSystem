package com.bravo;

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
