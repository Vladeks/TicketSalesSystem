package com.bravo;

import java.util.Date;

public class Station {
    private String name;
    private  Date arrival;
    private Date diparture;

    public Station(String name) {
        this.name = name;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDiparture() {
        return diparture;
    }

    public void setDiparture(Date diparture) {
        this.diparture = diparture;
    }
}
