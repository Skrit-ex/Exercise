package com.example.dao;

import com.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.NoResultException;
import java.util.Optional;

@Component
public class HibernateUserDao {


    @Autowired
    private SessionFactory sessionFactory;


    @Transactional
    public void save(User user){
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(user);
    }

    @Transactional
    public Optional<User> findByName(String username){
        Session currentSession = sessionFactory.getCurrentSession();
        Query<User> query = currentSession.createQuery("from User where username =: username", User.class);
        query.setParameter("name", username);
        try{
            return Optional.of(query.getSingleResult());
        }
        catch (NoResultException e){
            return Optional.empty();
        }
    }

    @Transactional
    public Optional<User> findByEmail(String email){
        Session currentSession = sessionFactory.getCurrentSession();
        Query<User> query = currentSession.createQuery("from User where email =: email", User.class);
        query.setParameter("email", email);
        try {
            return Optional.of(query.getSingleResult());
        }
        catch (NoResultException e){
            return Optional.empty();
        }
    }
    @Transactional
    public User getId(Long id){
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(User.class, id);
    }
}
