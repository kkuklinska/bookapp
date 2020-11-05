package org.example.repository.Classroom;

import org.example.ClassRoom;
import org.example.repository.Classroom.ClassRoomRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;

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
        final Query<ClassRoom> query = session.createQuery("from Classroom where number= number", ClassRoom.class);
        query.setParameter("number", number);
        return query.uniqueResult();

    }

    @Override
    public void delete(int classroom) {

    }

    @Override
    public void book(int number) {

    }
}
