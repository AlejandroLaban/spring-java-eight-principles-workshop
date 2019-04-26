package com.alejandrolaban.backend.principles.java.seven.improvement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DiamondImprovementTest {

    @Test
    void givenObjectListWhenAddThenAssertEqualsOneWithOutDiamondOperator() {
        List<Object> ObjectList = new ArrayList<Object>();
        Object Object = new Object();
        ObjectList.add(Object);
        Assertions.assertEquals(1, ObjectList.size());
    }

    @Test
    void givenObjectListWhenAddThenAssertEqualsOneWithDiamondOperator() {
        List<Object> ObjectList = new ArrayList<>();
        Object Object = new Object();
        ObjectList.add(Object);
        Assertions.assertEquals(1, ObjectList.size());
    }
}
