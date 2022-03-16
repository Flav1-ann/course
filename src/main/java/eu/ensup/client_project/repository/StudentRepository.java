package eu.ensup.client_project.repository;

import eu.ensup.client_project.domaine.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Student repository.
 */
public interface StudentRepository extends JpaRepository<Student,Long> {

}
