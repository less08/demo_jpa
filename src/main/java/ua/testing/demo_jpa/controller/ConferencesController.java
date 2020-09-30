package ua.testing.demo_jpa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.testing.demo_jpa.dto.ConferencesDTO;
import ua.testing.demo_jpa.service.ConferenceAndReportService;

import java.lang.reflect.Method;

@Slf4j
@RestController
@RequestMapping(value = "/conferences")
public class ConferencesController {
    private ConferenceAndReportService conferenceAndReportService;

    @Autowired
    public ConferencesController (ConferenceAndReportService conferenceAndReportService){
        this.conferenceAndReportService=conferenceAndReportService;
    }

    @RequestMapping(value = "conferences", method = RequestMethod.GET)
   public ConferencesDTO getConferences (){
        log.info("{}",conferenceAndReportService.getAllConferences());
        return conferenceAndReportService.getAllConferences();
   }

}
