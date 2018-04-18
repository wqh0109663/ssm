package it.huanzi.mapper;

import it.huanzi.model.Country;

import java.util.List;

/**
 * Created by wqh on 2018/4/16.
 */
public interface CountryMapper {
    List<Country> getAllCountrys();
    Country getOneCountry(String countrycode);

}
