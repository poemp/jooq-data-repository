package org.poem.data;

import org.jooq.Condition;
import org.jooq.SortField;
import org.jooq.TableRecord;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 所有数据查询接口
 *
 * @author poem
 */
public class RepositoryImpl<T extends TableRecord<T>, ID extends Serializable> {

    /**
     * 统计数据
     *
     * @return
     */
    Long count() {
    }

    /**
     * 删除数据
     *
     * @param entity 实体
     */
    void delete(T entity) {

    }

    /**
     * 删除全部数据
     */
    void deleteAll() {

    }

    /**
     * 删除所有数据
     *
     * @param entities
     */
    void deleteAll(Iterable<? extends T> entities) {

    }

    /**
     * 根据id删除所有数据
     *
     * @param id id
     */
    void deleteById(ID id) {

    }

    /**
     * 是否存在
     *
     * @param id id
     * @return
     */
    Boolean existsById(ID id) {

    }


    /**
     * find all
     *
     * @return
     */
    <T> List<T> findAll() {

    }

    /**
     * 根据ids查询
     *
     * @param ids ids
     * @return
     */
    <T> List<T> findAllById(Iterable<ID> ids) {

    }


    /**
     * 根据id查询数据
     *
     * @param id  id
     * @param <T> 返回数据
     * @return
     */
    <T> T findById(ID id) {

    }


    /**
     * 保存数据
     *
     * @param entity 数据
     * @param <S>    类型
     */
    <S extends T> void save(S entity) {

    }


    /**
     * 保存数据
     *
     * @param entities 数据
     * @param <S>      类型
     * @return
     */
    <S extends T> List<S> saveAll(Iterable<S> entities) {

    }


    /**
     * 根据条件查询数据
     *
     * @param conditions 条件
     * @param <S>        数据类型
     * @return
     */
    <S extends T> List<S> findAllByConditions(List<Condition> conditions) {

    }

    /**
     * 根据条件查询数据
     *
     * @param condition 查询条件
     * @param <S>       数据类型
     * @return
     */
    <S extends T> List<S> findAllByCondition(Condition condition) {

    }


    /**
     * 根据条件查询数据
     *
     * @param conditions 查询条件
     * @param sortFields 排序
     * @param <S>        数据
     * @return
     */
    <S extends T> List<S> findSorting(List<Condition> conditions, Collection<SortField<?>> sortFields) {

    }
}
