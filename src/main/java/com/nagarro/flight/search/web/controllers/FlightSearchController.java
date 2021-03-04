/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.web.controllers;

import com.nagarro.flight.search.web.entity.FlightInfo;
import com.nagarro.flight.search.web.entity.FlightSearchQuery;
import com.nagarro.flight.search.web.services.FlightSearchService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Laura.Barragan
 */
@Controller
public class FlightSearchController {

    @Autowired
    private FlightSearchService service;

    @RequestMapping(path = "/hello-page.html")
    public ModelAndView helloWorld() {
        ModelAndView view = new ModelAndView();
        view.setViewName("hello");
        return view;
    }

    @RequestMapping(path = "/searchFlight", method = RequestMethod.POST, headers = "Accept=application/json")
    public List<FlightInfo> searchFlight(FlightSearchQuery query) {
        List<FlightInfo> results = service.searchFlight(query);

        return results;
    }

}
