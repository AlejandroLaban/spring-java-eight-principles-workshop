package com.alejandrolaban.backend.principles.java.eight;

import com.alejandrolaban.backend.principles.java.eight.service.CustomIncrement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllInOneImprovementTest {

    @BeforeEach
    void setUp() {

    }

    private List<Integer> multipliedAsIntegerList(List<Long> longArray, CustomIncrement customIncrement) {
        return longArray.stream()
                .map(customIncrement::incrementAsInteger)
                .collect(Collectors.toList());
    }

    @Test
    void givenAnLongArrayWhenMultipliedAsIntegerListThenAssertEqualsNineAndMatchAssertEqualsTwentyOne() {
        Long[] longs = new Long[]{3L, 7L};
        List<Long> longList = Arrays.asList(longs);
        List<Integer> incrementAsIntegerList = multipliedAsIntegerList(longList, a -> {
            Float result = a * 3F;
            return result.intValue();
        });

        Assertions.assertEquals(9, incrementAsIntegerList.get(0).intValue());
        Assertions.assertEquals(21, incrementAsIntegerList.get(1).intValue());
    }

}
