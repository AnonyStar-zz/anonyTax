package cn.anony.test.Service;

import cn.anony.test.entity.Person;

import java.io.Serializable;

/**
 * Created by anony on 2016/9/26.
 */
public interface ITestService {
    public abstract void say();
    public void save(Person person);
    public Person findPerson(Serializable id);
}
