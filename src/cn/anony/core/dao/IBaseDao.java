package cn.anony.core.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by anony on 2016/9/28.
 */
public interface IBaseDao<T> {
    public void save(T entity);
    public void delete(Serializable id);
    public void update(T entity);
    public  T findObjectById(Serializable id);
    public List<T> findObjects();
}
