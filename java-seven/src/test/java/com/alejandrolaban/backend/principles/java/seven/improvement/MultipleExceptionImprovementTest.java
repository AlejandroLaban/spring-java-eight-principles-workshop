package com.alejandrolaban.backend.principles.java.seven.improvement;

import com.alejandrolaban.backend.principles.java.seven.service.ServiceJavaSeven;
import com.alejandrolaban.backend.principles.java.seven.service.ServiceJavaSevenImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpServerErrorException;

@Slf4j
public class MultipleExceptionImprovementTest {

    private ServiceJavaSeven simpleService;

    @BeforeEach
    void setUp() {
        simpleService = new ServiceJavaSevenImpl();
    }


    @Test
    void whenServiceCallThenAssertThatDoesNotThrowBadGatewayException() {
        Assertions.assertDoesNotThrow(() -> simpleService.call(HttpStatus.BAD_GATEWAY));
    }

    @Test
    void whenServiceCallThenAssertThatDoesNotThrowBadServiceUnavailableException() {
        Assertions.assertDoesNotThrow(() -> simpleService.call(HttpStatus.SERVICE_UNAVAILABLE));
    }

    @Test
    void whenServiceCallThenAssertThatDoesThrowNotImplementedException() {
        Assertions.assertThrows(HttpServerErrorException.NotImplemented.class, () -> simpleService.call(HttpStatus.NOT_IMPLEMENTED));
    }
}
