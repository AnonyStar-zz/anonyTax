package cn.anony.test.action;

import cn.anony.test.Service.ITestService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;

/**
 * Created by anony on 2016/9/26.
 */
public class TestAction extends ActionSupport {
    @Resource
    private ITestService testService;
    public String execute(){
        testService.say();
        return SUCCESS;
    }


}
