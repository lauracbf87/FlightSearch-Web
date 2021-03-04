/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.web.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Laura.Barragan
 */
@Entity()
public class FlightInfo implements Serializable {

    @Id
    private String flightNumber;
    private String departureLocation;
    private String arrivalLocation;
    private Date validTill;
    private int flightTime;
    private float flightDuration;
    private float fare;
    private String seatAvailability;
    private String class_;

    public FlightInfo() {
    }

    public FlightInfo(String flightNumber, String departureLocation, String arrivalLocation, Date validTill, int flightTime, float flightDuration, float fare, String seatAvailability, String class_) {
        this.flightNumber = flightNumber;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.validTill = validTill;
        this.flightTime = flightTime;
        this.flightDuration = flightDuration;
        this.fare = fare;
        this.seatAvailability = seatAvailability;
        this.class_ = class_;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
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

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    public float getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(float flightDuration) {
        this.flightDuration = flightDuration;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public String getSeatAvailability() {
        return seatAvailability;
    }

    public void setSeatAvailability(String seatAvailability) {
        this.seatAvailability = seatAvailability;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    @Override
    public String toString() {
        return "FlightInfo{" + "flightNumber=" + flightNumber + ", departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation + ", validTill=" + validTill + ", flightTime=" + flightTime + ", flightDuration=" + flightDuration + ", fare=" + fare + ", seatAvailability=" + seatAvailability + ", class_=" + class_ + '}';
    }

}
