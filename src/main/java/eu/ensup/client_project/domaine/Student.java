package eu.ensup.client_project.domaine;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student extends PhysicalPerson {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate bithday;

    public Student(Long id, String name, String adress, String email, String phone, String lastName,LocalDate bithday) {
        super(id, name, adress, email, phone, lastName);
    }

}
