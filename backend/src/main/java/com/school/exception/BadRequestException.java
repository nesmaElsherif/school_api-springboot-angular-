package com.school.exception;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST,reason="Task Description is required")
public class BadRequestException  extends RuntimeException  {
}
