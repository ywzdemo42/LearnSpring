package com.ywz.dao;
import com.ywz.domain.User;
import java.util.List;

/**
 * @author yangdong
 * @creat 2019-10-22 11:36
 * @Description:TODO
 */
public interface IUserDao {
    //@Select("select * from user")
    List<User> findAllUser();
}
