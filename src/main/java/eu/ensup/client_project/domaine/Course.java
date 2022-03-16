package eu.ensup.client_project.domaine;

import lombok.*;

import javax.persistence.*;

/**
 * The type Course.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Course {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int hours;
    private String theme;
}
