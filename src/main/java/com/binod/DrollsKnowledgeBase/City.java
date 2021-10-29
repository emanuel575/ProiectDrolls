package com.binod.DrollsKnowledgeBase;

import java.util.List;
import java.util.Objects;

public class City {
    private String _cityName;
    private Double _annualGrowth;

    public City(String _cityName, Double _annualGrowth) {
        this._cityName = _cityName;
        this._annualGrowth = _annualGrowth;
    }

    public String get_cityName() {
        return _cityName;
    }

    public void set_cityName(String _cityName) {
        this._cityName = _cityName;
    }


    public void set_cityZones(List<CityZone> _cityCityZones) {
    }

    public Double get_annualGrowth() {
        return _annualGrowth;
    }

    public void set_annualGrowth(Double _annualGrowth) {
        this._annualGrowth = _annualGrowth;
    }

    @Override
    public String toString() {
        return "City{" +
                "_cityName='" + _cityName + '\'' +
                ", _annualGrowth=" + _annualGrowth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(_cityName, city._cityName) && Objects.equals(_annualGrowth, city._annualGrowth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_cityName, _annualGrowth);
    }
}
