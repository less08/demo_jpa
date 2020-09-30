package ua.testing.demo_jpa.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.testing.demo_jpa.dto.ConferencesDTO;
import ua.testing.demo_jpa.repository.ConferenceRepository;
import ua.testing.demo_jpa.repository.ReportRepository;

@Slf4j
@Service
public class ConferenceAndReportService {
    private final ConferenceRepository conferenceRepository;
    private ReportRepository reportRepository;

    @Autowired
    public ConferenceAndReportService(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }


    public ConferencesDTO getAllConferences(){
        return new ConferencesDTO(conferenceRepository.findAll());
    }


}
