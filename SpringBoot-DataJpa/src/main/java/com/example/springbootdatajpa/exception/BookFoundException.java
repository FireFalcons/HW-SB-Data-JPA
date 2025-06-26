package com.example.springbootdatajpa.exception;

public class BookFoundException extends RuntimeException {
    public BookFoundException(String message) {
        super(message);
    }
}
