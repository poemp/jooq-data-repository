package org.poem.pagingsort;

import org.jooq.Condition;
import org.jooq.impl.TableRecordImpl;
import org.poem.data.Repository;
import org.poem.data.domain.PageImpl;
import org.poem.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;


/**
 * find and sort
 * @author poem
 */
public class PagingAndSortingRepository<T extends TableRecordImpl<T>, ID extends Serializable> extends Repository<T, ID> {


    /**
     * 分页查询
     * @param pageable  分页信息
     * @param <S>
     * @return
     */
    <S extends T> PageImpl<S> findAll(Pageable pageable);


    /**
     * 条件分页查询
     * @param conditions 条件
     * @param pageable 分页信息
     * @param sortFields 排序
     * @param <S>
     * @return
     */
    <S extends T> PageImpl<S> findConditionPageSorting(List<Condition> conditions, Pageable pageable);
}
