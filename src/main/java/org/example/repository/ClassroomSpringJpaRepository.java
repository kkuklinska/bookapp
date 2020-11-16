package org.example.repository;

import org.example.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClassroomSpringJpaRepository extends JpaRepository<ClassRoom, Long> {

    @Query("SELECT c FROM ClassRoom c where c.number=: number")
    ClassRoom findByNumber(@Param("number")int number);


    void delete(int delnumber);
}
