package com.jetbulb.interviews.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArraysTest {
    private static final int[] INPUT_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    @Test
    void shouldNotRetrieveEmpty() {
        assertThat(Arrays.shuffle(INPUT_VALUES)).isNotEmpty();
    }

    @Test
    void shouldContainsSameLength() {
        assertThat(Arrays.shuffle(INPUT_VALUES).length).isEqualTo(10);
    }

    @Test
    void shouldContainsSameValuesInAnyOrder() {
        assertThat(Arrays.shuffle(INPUT_VALUES)).containsExactlyInAnyOrder(INPUT_VALUES);
    }
}