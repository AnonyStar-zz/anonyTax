package cn.anony.nsfw.user.service.impl;

import cn.anony.nsfw.user.dao.IUserDao;
import cn.anony.nsfw.user.entity.User;
import cn.anony.nsfw.user.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by anony on 2016/9/28.
 */
@Service("userService")
public class UserService implements IUserService {

    @Resource
    IUserDao userDao;
    @Override
    public void save(User entity) {
        userDao.save(entity);
    }

    @Override
    public void delete(Serializable id) {
        userDao.delete(id);
    }

    @Override
    public void update(User entity) {
        userDao.update(entity);
    }

    @Override
    public User findObjectById(Serializable id) {
        return userDao.findObjectById(id);
    }

    @Override
    public List<User> findObjects() {
        return userDao.findObjects();
    }
}
