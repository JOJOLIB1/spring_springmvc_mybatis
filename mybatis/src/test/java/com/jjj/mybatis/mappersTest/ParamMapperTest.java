package com.jjj.mybatis.mappersTest;

import com.jjj.mybatis.mappers.ParamMapper;
import com.jjj.mybatis.mappers.UserMapper;
import com.jjj.mybatis.pojo.User;
import com.jjj.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: com.jjj.mybatis.mappersTest.ParamMapperTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-12 21:24
 */
public class ParamMapperTest {
    @Test
    public void testGetUserById() {
        ParamMapper mapper = SqlSessionUtil.getMapper(ParamMapper.class);
        System.out.println(mapper.getUserById(3));
    }
    @Test
    public void testGetUserByMore() {
        ParamMapper mapper = SqlSessionUtil.getMapper(ParamMapper.class);
        System.out.println(mapper.getUserByMore("张三", "男", "法律部"));
    }

    @Test
    public void testGetUserByPojo() {
        ParamMapper mapper = SqlSessionUtil.getMapper(ParamMapper.class);
        System.out.println(mapper.getUserByPojo(new User("张三", "男", "法律部")));
    }

    @Test
    public void testGetUserByMap() {
        ParamMapper mapper = SqlSessionUtil.getMapper(ParamMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("id", "4");
        System.out.println(mapper.getUserByMap(map));
    }

    @Test
    public void testGetUserByParam() {
        ParamMapper mapper = SqlSessionUtil.getMapper(ParamMapper.class);
        System.out.println(mapper.getUserByParam("李四", "女"));
    }
}
