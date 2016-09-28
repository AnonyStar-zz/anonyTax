package cn.anony.test.dao.impl;

import cn.anony.test.entity.Person;
import cn.anony.test.dao.ITestDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;

/**
 * Created by anony on 2016/9/27.
 */
public class TestDao extends HibernateDaoSupport implements ITestDao {
    @Override
    public void save(Person person) {
        getHibernateTemplate().save(person);
    }

    @Override
    public Person findPerson(Serializable id) {
        return getHibernateTemplate().get(Person.class,id);
    }
}
