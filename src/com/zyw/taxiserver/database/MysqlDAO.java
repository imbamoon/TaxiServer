package com.zyw.taxiserver.database;

import com.zyw.taxiserver.model.User;

import java.sql.ResultSet;
import java.util.List;

/**
 * Created by zyw on 2015/11/15.
 * 数据库访问接口
 */
public interface MysqlDAO {
    /**
     * 插入到数据库
     * @return 返回所在的行
     */
    public int insertUser(User user);

    public int deleteUser(User user);

    public int updateUserLocation(User user);

    public int updateUserName(User user);

    public User queryUserByPhone(String phone);

    public List<User> queryAllUser();

}
