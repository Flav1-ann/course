package eu.ensup.client_project.domaine;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@ToString
@MappedSuperclass
public class Director extends PhysicalPerson{

}
