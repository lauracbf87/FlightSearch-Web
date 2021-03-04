/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.web.repository;

import com.nagarro.flight.search.web.entity.FlightInfo;
import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laura.Barragan
 */
@Repository
public interface FlightSearchDAO extends JpaRepository<FlightInfo, String>{

    public List<FlightInfo> searchByFlightNumber(String flightNumber);
    
    @Query(value="SELECT FLIGHT_NO,DEP_LOC,ARR_LOC,VALID_TILL,FLIGHT_TIME,"
            + "FLIGHT_DUR,FARE,SEAT_AVAILABILITY,CLASS FROM FLIGHT_INFO "
            + "WHERE DEP_LOC= :departureLocation AND ARR_LOC = :arrivalLocation AND "
            + "VALID_TILL = :flightDate AND CLASS = :flightClass", nativeQuery=true)     
    public List<FlightInfo> searchFlightByQuery(String departureLocation, String arrivalLocation, Date flightDate, String flightClass);
    
}
