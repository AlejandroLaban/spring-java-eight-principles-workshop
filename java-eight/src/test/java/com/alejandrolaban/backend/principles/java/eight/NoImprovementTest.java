package com.alejandrolaban.backend.principles.java.eight;

import com.alejandrolaban.backend.principles.java.eight.service.CustomIncrementAsNonValidFunctionalInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NoImprovementTest {

    @BeforeEach
    void setUp() {

    }

    private List<Integer> multipliedAsIntegerList(long[] longArray, CustomIncrementAsNonValidFunctionalInterface customIncrementAsNonValidFunctionalInterface) {
        List<Integer> integerList = new ArrayList<>();

        for (int index = 0; index < longArray.length; index++) {
            integerList.add(customIncrementAsNonValidFunctionalInterface.incrementAsInteger(longArray[index]));
        }
        return integerList;
    }

    @Test
    void givenAnLongArrayWhenMultipliedAsIntegerListThenAssertEqualsNineAndMatchAssertEqualsTwentyOne() {
        long[] longs = new long[]{3L, 7L};

        List<Integer> incrementAsIntegerList = multipliedAsIntegerList(longs, new CustomIncrementAsNonValidFunctionalInterface() {
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
