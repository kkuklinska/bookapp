package org.example.repository.Classroom;

import org.example.ClassRoom;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
@org.example.repository.annotation.HibernateRepository
public class HibernateRepository implements ClassRoomRepository {
    @Override
    public void save(ClassRoom classroom) {
        final Session session = HibernateUtil.getSessionFactory().openSession();
session.beginTransaction();
session.save(classroom);
session.getTransaction().commit();
session.close();
    }

    @Override
    public ClassRoom findByNumber(int number) {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        final Query<ClassRoom> query = session.createQuery("from ClassRoom where number=:number", ClassRoom.class);
        query.setParameter("number", number);
        final ClassRoom classroom = query.uniqueResult();
        session.close();
        return classroom;

    }

    @Override
    public void delete(int number) {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        final Query<ClassRoom> query = session.createQuery("from ClassRoom where number=: number", ClassRoom.class);
        query.setParameter("number", number);
        ClassRoom classRoom = query.uniqueResult();
        session.delete(classRoom);
        session.close();
    }

    @Override
    public void book(int number) {
        final Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        final Query<ClassRoom> query = session.createQuery("from ClassRoom set available=false where number=: number", ClassRoom.class);
        ClassRoom classRoom = query.uniqueResult();
        classRoom.setAvailable(false);
//        query.setParameter("available", false);
//        session.update("available", false);
        session.close();

    }

    @Override
    public ClassRoom update(Long id, String name, int number, int seats, int projector, int whiteboard, int blackboard, int speakers, boolean available) {
        return null;
    }
}