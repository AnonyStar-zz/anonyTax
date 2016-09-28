package cn.anony.test.Service.impl;

import cn.anony.test.entity.Person;
import cn.anony.test.Service.ITestService;
import cn.anony.test.dao.impl.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by anony on 2016/9/26.
 */
@Service("testService")
public class TestService implements ITestService {
    @Override
    public void say() {
        System.out.println("service saying hi");
    }

    @Resource
    private TestDao testDao;
    @Override
    public void save(Person person) {
        testDao.save(person);
    }

    @Override
    public Person findPerson(Serializable id) {
        save(new Person("test"));
        return testDao.findPerson(id);
    }
}
