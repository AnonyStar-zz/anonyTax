package cn.anony.test;

import cn.anony.test.entity.Person;
import cn.anony.test.Service.ITestService;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by anony on 2016/9/26.
 */
public class TestMerge {

    private ClassPathXmlApplicationContext context;
    @Before
    public void loadCtx(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSpring(){
        ITestService ts = (ITestService)context.getBean("testService");
        ts.say();
    }

    @Test
    public void testHibernate(){
        SessionFactory sf = (SessionFactory) context.getBean("sessionFactory");
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(new Person("人员1"));
        transaction.commit();
        session.close();
    }

    @Test
    public void testServiceAndDao(){
       ITestService ts = (ITestService) context.getBean("testService");
        ts.save(new Person("人员2"));
    }

    @Test
    public void testTansactionReadOnly() throws Exception{
        ITestService ts = (ITestService) context.getBean("testService");
        Person person = ts.findPerson("1221321");
        System.out.println(person.getName());
    }

    @Test
    public void testTansactionRollback() throws Exception{
        ITestService ts = (ITestService) context.getBean("testService");
        ts.save(new Person("人员1212"));
    }
}
