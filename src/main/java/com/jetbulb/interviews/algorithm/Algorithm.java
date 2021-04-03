package com.jetbulb.interviews.algorithm;

public interface Algorithm<T, R> {
    Algorithm<T, R> execute(T data);
    Algorithm<T, R> sort();
    R get();
}
