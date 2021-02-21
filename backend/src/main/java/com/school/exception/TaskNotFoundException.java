package com.school.exception;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Cannot find task with given id")
public class TaskNotFoundException  extends RuntimeException{
}
