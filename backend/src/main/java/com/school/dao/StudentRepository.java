package com.school.dao;



import com.school.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
   TO CREATE API ADD ANNOTATION @RepositoryRestResource
   ANY API HAS 4 METHOD
   GET , PUT ,POST , DELETE
   1- localhost:8080/students
       btgeb 2sma el class 2ol 7arf frh small and add s at the end
       method get return all student
    2-localhost:8080/students/1 get  return student with id=1
    3-localhost:8080/students  post
    4-localhost:8080/students/1 delete
    5-localhost:8080/students/1
 */
@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student,Long> {
}
