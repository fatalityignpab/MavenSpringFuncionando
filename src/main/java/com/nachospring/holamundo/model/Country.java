package com.nachospring.holamundo.model;

public class Country {

    private String countryName;
    private Continent continent;
    private String capitalName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public Country(String countryName, Continent continent, String capitalName) {
        super();
        this.countryName = countryName;
        this.continent = continent;
        this.capitalName = capitalName;
    }

}