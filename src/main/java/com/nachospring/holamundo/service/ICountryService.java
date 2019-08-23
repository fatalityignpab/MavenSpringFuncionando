package com.nachospring.holamundo.service;

import java.util.List;

import com.nachospring.holamundo.model.Country;

public interface ICountryService {

    List<Country> findCountriesByName(String continentName);
}