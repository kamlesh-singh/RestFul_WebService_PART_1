package org.ttn.springrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotfoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

}
