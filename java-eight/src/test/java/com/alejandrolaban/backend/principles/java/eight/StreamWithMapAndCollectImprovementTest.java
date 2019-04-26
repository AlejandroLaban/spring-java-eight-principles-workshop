package com.alejandrolaban.backend.principles.java.eight;

import com.alejandrolaban.backend.principles.java.eight.service.CustomIncrementAsNonValidFunctionalInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithMapAndCollectImprovementTest {

    @BeforeEach
    void setUp() {

    }

    private List<Integer> multipliedAsIntegerList(List<Long> longArray, CustomIncrementAsNonValidFunctionalInterface customIncrementAsNonValidFunctionalInterface) {
        return longArray.stream()
                .map(elementLong -> {
                    return customIncrementAsNonValidFunctionalInterface.incrementAsInteger(elementLong);
                })
                .collect(Collectors.toList());
    }

    @Test
    void givenAnLongArrayWhenMultipliedAsIntegerListThenAssertEqualsNineAndMatchAssertEqualsTwentyOne() {
        Long[] longs = new Long[]{3L, 7L};
        List<Long> longList = Arrays.asList(longs);

        List<Integer> incrementAsIntegerList = multipliedAsIntegerList(longList, new CustomIncrementAsNonValidFunctionalInterface() {
            @Override
            public Integer incrementAsInteger(Long longValue) {
                Float result = longValue * 3F;
                return result.intValue();
            }

            @Override
            public Integer subtractAsInteger(Long longValue) {
                return null;
            }
        });

        Assertions.assertEquals(9, incrementAsIntegerList.get(0).intValue());
        Assertions.assertEquals(21, incrementAsIntegerList.get(1).intValue());
    }
}
