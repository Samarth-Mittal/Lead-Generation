package com.example.Lead.Generation.controller;

import com.example.Lead.Generation.model.Lead;
import com.example.Lead.Generation.model.LeadResponse;
import com.example.Lead.Generation.service.LeadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leads")
public class Controller {

    @Autowired
    private LeadServiceImpl leadService;

    @PostMapping(
            value = "/submit-lead",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public LeadResponse submitLead(@RequestBody Lead lead) {
        LeadResponse leadResponse = lead.isValidLead();
        if (!leadResponse.getResponse().equalsIgnoreCase("success")) {
            return leadResponse;
        }
        leadResponse = leadService.createLead(lead, leadResponse);
        return leadResponse;
    }
}
