package com.ywz.test;

import com.ywz.dao.IUserDao;
import com.ywz.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;
import java.util.List;

/**
 * @author yangdong
 * @creat 2019-10-22 14:53
 * @Description:TODO
 */
public class MybatisTest {
    public static void main(String[] args) throws Exception{
        //1读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3使用工厂生产sqlSession对象
        SqlSession session = factory.openSession();
        //4使用sqlsession创建dao接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5使用代理对象执行方法
        List<User> userList = userDao.findAllUser();
        for (User user:userList){
            System.out.println(user.toString());
        }
        //6释放资源
        session.close();
        in.close();

    }

}
