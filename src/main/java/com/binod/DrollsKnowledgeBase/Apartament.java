package com.binod.DrollsKnowledgeBase;

import java.util.Objects;

public class Apartament {
    private ApartamentType _apartmentType;
    private Double _price;
    private CompartimentType _compartimentType;
    private Double _area;

    public Boolean get_withFurniture() {
        return _withFurniture;
    }

    public void set_withFurniture(Boolean _withFurniture) {
        this._withFurniture = _withFurniture;
    }

    private Boolean _withFurniture;

    public Boolean get_isFinished() {
        return _isFinished;
    }

    public void set_isFinished(Boolean _isFinished) {
        this._isFinished = _isFinished;
    }

    private Boolean _isFinished;

    public Apartament(ApartamentType _apartmentType, Double _price, CompartimentType _compartimentType, Double _area) {
        this._apartmentType = _apartmentType;
        this._price = _price;
        this._compartimentType = _compartimentType;
        this._area = _area;
        this._isFinished = true;
        this._withFurniture = true;
    }

    public Apartament(ApartamentType _apartmentType, Double _price, CompartimentType _compartimentType, Double _area, Boolean _isFinished) {
        this._apartmentType = _apartmentType;
        this._price = _price;
        this._compartimentType = _compartimentType;
        this._area = _area;
        this._isFinished = _isFinished;
        this._withFurniture = true;
    }

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
