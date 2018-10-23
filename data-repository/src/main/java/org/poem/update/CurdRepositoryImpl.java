package org.poem.update;

import org.jooq.UpdatableRecord;
import org.poem.data.RepositoryImpl;

import java.io.Serializable;

/**
 * @author poem
 */
public class CurdRepositoryImpl<T extends UpdatableRecord<T>, ID extends Serializable> extends RepositoryImpl {


    void update(T entity){

    }

}
