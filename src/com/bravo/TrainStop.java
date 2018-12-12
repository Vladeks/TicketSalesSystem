package com.bravo;

import java.util.Date;

public class TrainStop {
    private String name;
    private Date arrival;
    private Date departure;

    public TrainStop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }
}
