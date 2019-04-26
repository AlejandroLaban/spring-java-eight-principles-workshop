package com.alejandrolaban.backend.principles.java.eight.service;

public interface CustomIncrementAsNonValidFunctionalInterfaceWithDefault {

    Integer incrementAsInteger(Long longValue);

    default Integer subtractAsInteger(Long longValue) {
        return longValue.intValue();
    }
}
