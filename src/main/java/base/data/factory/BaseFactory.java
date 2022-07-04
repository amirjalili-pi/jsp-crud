package main.java.base.data.factory;

import main.java.student.data.factory.Factory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class BaseFactory<T> {
    private static  SessionFactory factory = Factory.getFactory();
    public List<T> read(String className) {
        Session session = factory.getCurrentSession();
        List<T> items = null;
        try {
            session.beginTransaction();
            items = session.createQuery("from "+ className +" i").getResultList();
            session.getTransaction().commit();
        } finally {
            session.close();
        }
        return items;
    }


    public void save(T t) {
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(t);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    public void update(T t){
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(t);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }


    public void delete(T t) {
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            session.delete(t);
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    public T get(T t, int id){
        Session session = factory.getCurrentSession();
        T item;
        try {
            session.beginTransaction();
            item = (T) session.get(t.getClass(), id);
            session.getTransaction().commit();
        }finally {
            session.close();
        }

        return item;
    }


}
