package eu.ensup.client_project.domaine;


import lombok.*;

import javax.persistence.*;


/**
 * The type Teacher.
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Teacher extends PhysicalPerson{

    /**
     * Instantiates a new Teacher.
     *
     * @param id       the id
     * @param name     the name
     * @param adress   the adress
     * @param email    the email
     * @param phone    the phone
     * @param lastName the last name
     */
    public Teacher(Long id, String name, String adress, String email, String phone, String lastName) {
        super(id, name, adress, email, phone, lastName);
    }
}
