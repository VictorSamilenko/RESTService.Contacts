package com.example.contacts.service;


import com.example.contacts.entity.Contact;
import com.example.contacts.repository.ContactRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.regex.Pattern;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepositoryImpl repository;

    @Override
    public List<Contact> getAllByRegExp(Pattern pattern) {
        return repository.getAllByRegExp(pattern);
    }
}
