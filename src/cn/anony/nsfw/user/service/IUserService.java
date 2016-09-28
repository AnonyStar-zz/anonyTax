package cn.anony.nsfw.user.service;

import cn.anony.nsfw.user.entity.User;

import java.io.Serializable;
import java.util.List;



/**
 * Created by anony on 2016/9/28.
 */
public interface IUserService {
    //新增
    public void save(User entity);
    //删除根据ID
    public void delete(Serializable id);
    //更新
    public void update(User entity);
    //根据ID查找
    public  User findObjectById(Serializable id);
    //查找列表
    public List<User> findObjects();
}
