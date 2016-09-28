package cn.anony.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * Created by anony on 2016/9/28.
 */

public class TestLog {
    Log log = LogFactory.getLog(getClass());

    @Test
    public void test(){
        log.debug("这是debug");
        log.info("这是info");
        log.warn("这是warn");
        log.fatal("这是fatal");
    }
}
