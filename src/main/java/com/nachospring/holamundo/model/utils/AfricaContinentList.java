package com.nachospring.holamundo.model.utils;

import java.util.ArrayList;
import java.util.List;

import com.nachospring.holamundo.model.Continent;
import com.nachospring.holamundo.model.Country;

public class AfricaContinentList {
 
    public static List<Country> getAllAfricanCountries() {
        List<Country> africaCountries = new ArrayList<>();
        africaCountries.add(new Country("Egypt", Continent.AFRICA, "Cairo"));
        africaCountries.add(new Country("Kenia", Continent.AFRICA, "Nairo"));
        return africaCountries;
    }
}