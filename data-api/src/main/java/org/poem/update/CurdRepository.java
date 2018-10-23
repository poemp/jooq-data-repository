package org.poem.update;

import org.jooq.UpdatableRecord;
import org.poem.data.Repository;

import java.io.Serializable;

/**
 * @author poem
 */
public interface CurdRepository<T extends UpdatableRecord<T>, ID extends Serializable> extends Repository {


    void update(T entity);


}
