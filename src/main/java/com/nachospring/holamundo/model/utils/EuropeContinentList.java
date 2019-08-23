package com.nachospring.holamundo.model.utils;

import java.util.ArrayList;
import java.util.List;

import com.nachospring.holamundo.model.Continent;
import com.nachospring.holamundo.model.Country;

public class EuropeContinentList {
 
    public static List<Country> getAllEuropeCountries() {
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("Spain", Continent.EUROPE, "Madrid"));
        europeCountries.add(new Country("Italy", Continent.EUROPE, "Rome"));
        return europeCountries;
    }
}