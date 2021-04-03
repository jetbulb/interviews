package com.jetbulb.interviews.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class GroupingAlgorithmTest {
    private static final long[] numbers = {1, 2, 4, 4, 1, 4, 0, 4, 4};
    private GroupedCounterAlgorithm algorithm;

    @BeforeEach
    void setUp() {
        algorithm = new GroupedCounterAlgorithm();
    }

    @Test
    void shouldGroupUniqueElementsByValue() {
        Map<Long, Long> groupedValues = algorithm.execute(numbers).get();
        System.out.println(groupedValues);
        assertThat(groupedValues.get(0L)).isEqualTo(1);
        assertThat(groupedValues.get(1L)).isEqualTo(2);
        assertThat(groupedValues.get(2L)).isEqualTo(1);
        assertThat(groupedValues.get(4L)).isEqualTo(5);
    }

    @Test
    void shouldSortDescendingly() {
        Map<Long, Long> groupedValues = algorithm.execute(numbers).sort().get();
        assertThat(groupedValues.keySet()).containsExactly(4L, 2L, 1L, 0L);
    }

}