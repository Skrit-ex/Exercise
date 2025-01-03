package com.example.dao;

import com.example.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

@Component
public class HibernateBookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void saveAddBook(Book book){
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(book);
    }

    @Transactional
    public Optional<Book>findByNameBook (String nameBook){
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Book> bookQuery = currentSession.createQuery("from Book where nameBook =: nameBook", Book.class);
        bookQuery.setParameter("nameBook", nameBook);
        try {
                return Optional.of(bookQuery.getSingleResult());
        }
        catch (NoResultException e){
            return Optional.empty();
        }
    }

    @Transactional
    public Optional<Book> findByAuthor( String author){
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Book> bookQuery = currentSession.createQuery("from Book where author =: author", Book.class);
        bookQuery.setParameter("author", author);
        try {
            return Optional.of(bookQuery.getSingleResult());
        }catch (NoResultException e){
            return Optional.empty();
        }
    }

    @Transactional
    public List<Book> findAll(){
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Book", Book.class).getResultList();
    }

    @Transactional
    public void save(Book book){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try{
            transaction= session.beginTransaction();
            session.save(book);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            session.close();
        }

    }

}
