package com.alejandrolaban.backend.principles.java.seven.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

public interface ServiceJavaSeven {

    void call(HttpStatus httpStatus) throws HttpServerErrorException;
}
