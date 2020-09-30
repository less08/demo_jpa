package ua.testing.demo_jpa.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ConferenceDTO {
    private String name;
    private String description;
    private String place;
    private Date date;

    private List<ReportDTO> reportDTOList;
}
