package com.bravo;

public class Ticket {
    private User user;
    private String from;
    private String to;
    private int cost;
    private boolean isFree = true;

    public boolean addPassnager(User user, String from, String to) {
        if(isFree(from, to)) {
            this.user = user;
            this.from = from;
            this.to = to;
            this.isFree = false;
            return true;
        } else {
            return false;
        }
    }

    public void removePassanger(User user) {
        this.user = null;
        this.from = null;
        this.to = null;
        this.isFree = true;
    }

    public boolean isFree(String from, String to) {
        //TODO: add checking
        return false;
    }

    public boolean isFree() {
        return isFree;
    }
}
