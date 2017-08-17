package com.example.contacts.repository;


import com.example.contacts.entity.DomainObject;

import java.util.List;
import java.util.regex.Pattern;

public interface ContactRepository<V extends DomainObject> {

    List<V> getAllByRegExp(Pattern regExp);

}
