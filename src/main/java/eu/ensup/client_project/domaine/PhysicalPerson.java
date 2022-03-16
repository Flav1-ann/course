package eu.ensup.client_project.domaine;

import lombok.*;

import javax.persistence.*;

/**
 * The type Physical person.
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class PhysicalPerson extends Person{

    private String lastName;

    /**
     * Instantiates a new Physical person.
     *
     * @param id       the id
     * @param name     the name
     * @param adress   the adress
     * @param email    the email
     * @param phone    the phone
     * @param lastName the last name
     */
    public PhysicalPerson(Long id, String name, String adress, String email, String phone, String lastName) {
        super(id, name, adress, email, phone);
        this.lastName = lastName;
    }


}
