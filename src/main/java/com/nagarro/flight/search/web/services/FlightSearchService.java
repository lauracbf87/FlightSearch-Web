/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.web.services;

import com.nagarro.flight.search.web.entity.FlightInfo;
import com.nagarro.flight.search.web.entity.FlightSearchQuery;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nagarro.flight.search.web.repository.FlightSearchDAO;
import java.sql.Date;

/**
 *
 * @author Laura.Barragan
 */
@Service
public class FlightSearchService {
    
    @Autowired
    FlightSearchDAO dao;

    public List<FlightInfo> searchFlight(FlightSearchQuery query) {
        return dao.searchFlightByQuery(query.getDepartureLocation(), query.getArrivalLocation(), 
                Date.valueOf(query.getFlightDate()), query.getFlightClass());
    }
    
}
