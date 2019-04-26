package com.alejandrolaban.backend.principles.java.seven.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

import java.nio.charset.Charset;

@Slf4j
public class ServiceJavaSevenImpl implements ServiceJavaSeven {

    @Override
    public void call(HttpStatus httpStatus) throws HttpServerErrorException {
        try {
            throw HttpServerErrorException.create(httpStatus, null, null, null, Charset.defaultCharset());
        } catch (HttpServerErrorException.ServiceUnavailable | HttpServerErrorException.BadGateway e) {
            log.error("Error while calling", e);
        }
    }
}
