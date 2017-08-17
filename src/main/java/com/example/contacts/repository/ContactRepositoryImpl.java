package com.example.contacts.repository;


import com.example.contacts.entity.Contact;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

@Repository
public class ContactRepositoryImpl implements ContactRepository<Contact>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Contact> getAllByRegExp(Pattern pattern) {
        Session session = sessionFactory.getCurrentSession();
        ScrollableResults results = session.createQuery("from Contact").scroll();
        List<Contact> contacts = new LinkedList();
        while (results.next()) {
            Contact contact = (Contact) results.get(0);
            if (pattern.matcher(contact.getName()).matches()) {
                contacts.add(contact);
            }
        }
        return contacts;
    }

}
