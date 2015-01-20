package cuc.sture.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cuc.sture.domain.Student;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

    List<Student> findByStuId(String stuId);
}
