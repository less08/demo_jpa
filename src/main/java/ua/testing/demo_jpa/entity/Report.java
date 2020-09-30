package ua.testing.demo_jpa.entity;

import javax.persistence.*;
@Entity
@Table( name="report",
        uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "tags", nullable = false)
    private String tags;
    @Column(name = "conference_id", nullable = false)
    private Long conferenceId;
    @Column(name = "speaker_id", nullable = false)
    private String speaker_id;

}
