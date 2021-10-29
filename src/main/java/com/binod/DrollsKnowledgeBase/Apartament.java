package com.binod.DrollsKnowledgeBase;

import java.util.Objects;

public class Apartament {
    private ApartamentType _apartmentType;
    private Double _price;
    private CompartimentType _compartimentType;
    private Double _area;

    public ApartamentType get_apartmentType() {
        return _apartmentType;
    }

    public void set_apartmentType(ApartamentType _apartmentType) {
        this._apartmentType = _apartmentType;
    }

    public Double get_price() {
        return _price;
    }

    public void set_price(Double _price) {
        this._price = _price;
    }

    public CompartimentType get_compartimentType() {
        return _compartimentType;
    }

    public void set_compartimentType(CompartimentType _compartimentType) {
        this._compartimentType = _compartimentType;
    }

    public Double get_area() {
        return _area;
    }

    public void set_area(Double _area) {
        this._area = _area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartament that = (Apartament) o;
        return _apartmentType == that._apartmentType && Objects.equals(_price, that._price) && _compartimentType == that._compartimentType && Objects.equals(_area, that._area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_apartmentType, _price, _compartimentType, _area);
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "_apartmentType=" + _apartmentType +
                ", _price=" + _price +
                ", _compartimentType=" + _compartimentType +
                ", _area=" + _area +
                '}';
    }
}
