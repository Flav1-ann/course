package eu.ensup.client_project.repository;

import eu.ensup.client_project.domaine.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
