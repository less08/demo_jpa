package ua.testing.demo_jpa.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name="conference",
        uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "place", nullable = false)
    private String place;
    @Column(name = "date", nullable = false)
    private String date;

}
