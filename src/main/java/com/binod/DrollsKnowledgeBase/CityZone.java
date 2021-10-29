package com.binod.DrollsKnowledgeBase;

import java.util.Objects;

public class CityZone {
    private String _zoneName;
    private double _annualGrowthPercent;
    private double _zoneMedianPricePerSquareMeters;

    public CityZone(String _zoneName, double _annualGrowthPercent, double _zoneMedianPricePerSquareMeters) {
        this._zoneName = _zoneName;
        this._annualGrowthPercent = _annualGrowthPercent;
        this._zoneMedianPricePerSquareMeters = _zoneMedianPricePerSquareMeters;
    }

    public String get_zoneName() {
        return _zoneName;
    }

    public void set_zoneName(String _zoneName) {
        this._zoneName = _zoneName;
    }

    public double get_annualGrowthPercent() {
        return _annualGrowthPercent;
    }

    public void set_annualGrowthPercent(double _annualGrowthPercent) {
        this._annualGrowthPercent = _annualGrowthPercent;
    }

    public double get_zoneMedianPricePerSquareMeters() {
        return _zoneMedianPricePerSquareMeters;
    }

    public void set_zoneMedianPricePerSquareMeters(double _zoneMedianPricePerSquareMeters) {
        this._zoneMedianPricePerSquareMeters = _zoneMedianPricePerSquareMeters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityZone cityZone = (CityZone) o;
        return Double.compare(cityZone._annualGrowthPercent, _annualGrowthPercent) == 0 && Double.compare(cityZone._zoneMedianPricePerSquareMeters, _zoneMedianPricePerSquareMeters) == 0 && Objects.equals(_zoneName, cityZone._zoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_zoneName, _annualGrowthPercent, _zoneMedianPricePerSquareMeters);
    }

    @Override
    public String toString() {
        return "CityZone{" +
                "_zoneName='" + _zoneName + '\'' +
                ", _annualGrowthPercent=" + _annualGrowthPercent +
                ", _zoneMedianPricePerSquareMeters=" + _zoneMedianPricePerSquareMeters +
                '}';
    }
}
