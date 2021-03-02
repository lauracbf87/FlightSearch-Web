/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nagarro.flight.search.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Laura.Barragan
 */
@Controller
public class FlightSearchController {

    @RequestMapping(value="/hello-page.html")
    public ModelAndView helloWorld(){
        ModelAndView view = new ModelAndView();     
        view.setViewName("hello");
        return view;
    }
    
}
