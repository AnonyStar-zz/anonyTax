package cn.anony.core.dao.impl;

import cn.anony.core.dao.IBaseDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by anony on 2016/9/28.
 */
public abstract class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T>  {

    private Class<T> clazz;

    public BaseDao() {
        ParameterizedType pt = (ParameterizedType) getClass().getGenericSuperclass();
        clazz = (Class<T>) pt.getActualTypeArguments()[0];
    }

    @Override
    public void save(T entity) {
        getHibernateTemplate().save(entity);
    }

    @Override
    public void delete(Serializable id) {
        getHibernateTemplate().delete(id);
    }

    @Override
    public void update(T entity) {
        getHibernateTemplate().update(entity);
    }

    @Override
    public T findObjectById(Serializable id) {
        return null;
    }

    @Override
    public List<T> findObjects() {
        return null;
    }
}
