package com.company.exceptions;

public class DuplicatesModelName extends Exception { //любая ошибка, которая возникает в ходе выполнения программы
    public DuplicatesModelName(String message) {
        super(message);
    }
}
