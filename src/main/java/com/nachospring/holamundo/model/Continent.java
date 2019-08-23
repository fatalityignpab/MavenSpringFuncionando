package com.nachospring.holamundo.model;

public enum Continent {
    ASIA(1, "asia"), 
    EUROPE(2, "europe"), 
    AFRICA(3, "africa"), 
    NORTH_AMERICA(4, "north_america"), 
    SOUTH_AMERICA(5, "south_america"), 
    UNKNOWN(6, "UNKNOWN");
    
    private int continentID;
    private String continentName;

    Continent(int continentID, String continentName) {
        this.continentID = continentID;
        this.continentName = continentName;
    }

    public int getContinentID() {
        return continentID;
    }

    public void setContinentID(int continentID) {
        this.continentID = continentID;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public static Continent continentByName(String name) {
        for (Continent continent : values()) {
            if (continent.getContinentName().equals(name)) {
                return continent;
            }
        }
        return UNKNOWN;
    }
    
}