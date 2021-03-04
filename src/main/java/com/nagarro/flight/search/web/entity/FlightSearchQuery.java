/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.web.entity;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Laura.Barragan
 */
public class FlightSearchQuery implements Serializable {

    /**
     * @return the outputPreference
     */
    public String getOutputPreference() {
        return outputPreference;
    }

    /**
     * @param outputPreference the outputPreference to set
     */
    public void setOutputPreference(String outputPreference) {
        this.outputPreference = outputPreference;
    }

    private String departureLocation;
    private String arrivalLocation;
    private LocalDate flightDate;
    private String flightClass;
    private String outputPreference;

    public FlightSearchQuery() {
    }

    public FlightSearchQuery(String departureLocation, String arrivalLocation, LocalDate flightDate, String flightClass) {
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.flightDate = flightDate;
        this.flightClass = flightClass;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    @Override
    public String toString() {
        return "FlightSearchQuery{" + "departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation + ", flightDate=" + flightDate + ", flightClass=" + flightClass + ", outputPreference=" + outputPreference + '}';
    }

}
