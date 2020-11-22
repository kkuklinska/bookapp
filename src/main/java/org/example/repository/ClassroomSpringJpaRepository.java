package org.example.repository;

import org.example.repository.entity.ClassRoom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClassroomSpringJpaRepository extends JpaRepository<ClassRoom, Long> {

//    @Query("SELECT c FROM ClassRoom c where c.number=: number")
    ClassRoom findByNumber(int number);

//    List<ClassRoom> findByName(String name);
//
//    Page<ClassRoom> findByName(String name, Pageable pageable);

//    @Query("DELETE c FROM ClassRoom c where c.number=: number")
//    void delete(@Param("number")int number);
}
