package com.example.namereversecontroller.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public StringBuilder reverseName(String name) {
        StringBuilder nameReversed = new StringBuilder(name);
        return nameReversed.reverse();
    }
}
