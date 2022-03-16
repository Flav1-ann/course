package eu.ensup.client_project.domaine;


import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Teacher extends PhysicalPerson{

    public Teacher(Long id, String name, String adress, String email, String phone, String lastName) {
        super(id, name, adress, email, phone, lastName);
    }
}
