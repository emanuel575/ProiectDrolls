package com.binod.DrollsKnowledgeBase;

public class User {
    private String _UniqueName;
    private Double _maxBuget;
    private Double _apartamentArea;
    private City _chosenCity;
    private CompartimentType _chosenCompartiment;
    private CityZone _chosenCityZone;

    public Double get_targetAnnualGrowth() {
        return _targetAnnualGrowth;
    }

    public void set_targetAnnualGrowth(Double _targetAnnualGrowth) {
        this._targetAnnualGrowth = _targetAnnualGrowth;
    }

    private Double _targetAnnualGrowth;

    public PaymentType get_chosenPaymentType() {
        return _chosenPaymentType;
    }

    public void set_chosenPaymentType(PaymentType _chosenPaymentType) {
        this._chosenPaymentType = _chosenPaymentType;
    }

    private PaymentType _chosenPaymentType;

    public ApartamentType get_chosenApartamentType() {
        return _chosenApartamentType;
    }

    public void set_chosenApartamentType(ApartamentType _chosenApartamentType) {
        this._chosenApartamentType = _chosenApartamentType;
    }

    private ApartamentType _chosenApartamentType;

    public City get_chosenCity() {
        return _chosenCity;
    }

    public void set_chosenCity(City _chosenCity) {
        this._chosenCity = _chosenCity;
    }

    public String get_UniqueName() {
        return _UniqueName;
    }

    public void set_UniqueName(String _UniqueName) {
        this._UniqueName = _UniqueName;
    }

    public Double get_maxBuget() {
        return _maxBuget;
    }

    public void set_maxBuget(Double _maxBuget) {
        this._maxBuget = _maxBuget;
    }

    public Double get_apartamentArea() {
        return _apartamentArea;
    }

    public void set_apartamentArea(Double _apartamentArea) {
        this._apartamentArea = _apartamentArea;
    }

    public CompartimentType get_chosenCompartiment() {
        return _chosenCompartiment;
    }

    public void set_chosenCompartiment(CompartimentType _chosenCompartiment) {
        this._chosenCompartiment = _chosenCompartiment;
    }

    public CityZone get_chosenCityZone() {
        return _chosenCityZone;
    }

    public void set_chosenCityZone(CityZone _chosenCityZone) {
        this._chosenCityZone = _chosenCityZone;
    }
}
