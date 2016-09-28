package cn.anony.test.dao;

import cn.anony.test.entity.Person;

import java.io.Serializable;

/**
 * Created by anony on 2016/9/27.
 */
public interface ITestDao {
    public void save(Person person);
    public Person findPerson(Serializable id);
}
