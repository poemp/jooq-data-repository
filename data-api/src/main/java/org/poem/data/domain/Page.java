package org.poem.data.domain;

import java.util.function.Function;

/**
 * @author poem
 */
public interface Page<T> {


    /**
     * 所有页
     *
     * @return
     */
    int getTotalPages();


    /**
     * 获取数据量
     *
     * @return
     */
    long getTotalElements();

    /**
     * @param converter
     * @param <U>
     * @return
     * @since 1.8
     */
    <U> Page<U> map(Function<? super T, ? extends U> converter);
}
