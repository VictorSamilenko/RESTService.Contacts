package com.example.contacts.service;


import com.example.contacts.entity.Contact;

import java.util.List;
import java.util.regex.Pattern;

public interface ContactService {

    List<Contact> getAllByRegExp(Pattern regExp);
}
