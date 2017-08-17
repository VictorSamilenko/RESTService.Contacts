package com.example.contacts.controller;

import com.example.contacts.entity.Contact;
import com.example.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@RestController
public class ContactController {

    @Autowired
    private ContactService service;

    @RequestMapping(value = "/contacts",method = RequestMethod.GET)
    public ResponseEntity<Object> getAllByRegExp(@RequestParam String nameFilter) {
        Pattern pattern;
        try {
            pattern = Pattern.compile(nameFilter);
        } catch (PatternSyntaxException e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        List<Contact> contacts = service.getAllByRegExp(pattern);
        Map<String, List<Contact>> map = new HashMap<>();
        map.put("contacts", contacts);
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
}
