package com.jjj.mybatis.mappersTest;

import com.jjj.mybatis.mappers.UserMapper;
import com.jjj.mybatis.pojo.User;
import com.jjj.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @className: com.jjj.mybatis.mappersTest.UserMapperTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-12 8:08
 */
public class UserMapperTest {
    @Test
    public void testAddUser() {
        User user = new User("王五", "男", "A");
        SqlSession sqlSession = SqlSessionUtil.getSqlSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.insertUser(user));
    }
    @Test
    public void testDeleteUser() {
        UserMapper mapper = SqlSessionUtil.getMapper(UserMapper.class);
        System.out.println(mapper.deleteUser(2));
    }
    @Test
    public void testUpdateUser() {
        User user = new User(3,"李四", "女", "B");
        UserMapper mapper = SqlSessionUtil.getMapper(UserMapper.class);
        System.out.println(mapper.updateUser(user));
    }

}

