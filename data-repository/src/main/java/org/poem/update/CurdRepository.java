package org.poem.update;

import org.jooq.UpdatableRecord;
import org.poem.data.Repository;

import java.io.Serializable;

/**
 * @author poem
 */
public class CurdRepository<T extends UpdatableRecord<T>, ID extends Serializable> extends Repository {


    void update(T entity);


}
