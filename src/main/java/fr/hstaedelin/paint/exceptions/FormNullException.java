package fr.hstaedelin.paint.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FormNullException extends RuntimeException {
    public FormNullException(String s){
        super(s);
    }
}
