package org.poem.data.domain;

import org.jooq.SortField;

/**
 * @author poem
 */
public class Pageable {

    /**
     * 获取当前页
     *
     * @return
     */
    Integer getPageNumber();

    /**
     * 获取页大小
     *
     * @return
     */
    Integer getPageSize();

    /**
     * 获取排序
     *
     * @return
     */
    SortField<?> getSort();
}
