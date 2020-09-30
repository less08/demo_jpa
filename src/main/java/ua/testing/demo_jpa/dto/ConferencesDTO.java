package ua.testing.demo_jpa.dto;

import lombok.*;
import ua.testing.demo_jpa.entity.Conference;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ConferencesDTO {
    private List<Conference> conferences;
}
