package com.example.autobase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.autobase.service.destination.DestinationService;

import java.security.Principal;
import java.util.Collection;

@Controller
public class DestintionController {

    @Autowired
    DestinationService destinationService;

    @RequestMapping(value = "/destinations/get", method = RequestMethod.GET)
    public String getDestinations(Model model, Principal principal) {
        model.addAttribute("destinations", destinationService.findAll());

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        Collection<GrantedAuthority> authorities = loginedUser.getAuthorities();
        StringBuilder roles = new StringBuilder();
        for (GrantedAuthority authority : authorities) {
            roles.append(authority.getAuthority());
        }

        model.addAttribute("roles", roles.toString());


        return "destinations";
    }
}
