package org.example.repository;

import org.example.repository.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomSpringJpaRepository extends JpaRepository<Classroom, Long> {

//    @Query("SELECT c FROM ClassRoom c where c.number=: number")
    Classroom findByNumber(int number);

//    List<ClassRoom> findByName(String name);
//
//    Page<ClassRoom> findByName(String name, Pageable pageable);

//    @Query("DELETE c FROM ClassRoom c where c.number=: number")
//    void delete(@Param("number")int number);
}
