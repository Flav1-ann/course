package eu.ensup.client_project.domaine;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class PhysicalPerson extends Person{

    private String lastName;

    public PhysicalPerson(Long id, String name, String adress, String email, String phone, String lastName) {
        super(id, name, adress, email, phone);
        this.lastName = lastName;
    }


}
