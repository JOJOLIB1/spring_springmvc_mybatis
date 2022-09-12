package com.jjj.mybatis.mappers;

import com.jjj.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @className: com.jjj.mybatis.mappers.ParamMapper
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-12 21:00
 */
public interface ParamMapper {
    /**
     * 单个字面值的情况
     */
    User getUserById(Integer id);

    /**
     * 多个字面值的情况
     */
    User getUserByMore(String name, String gender, String department);

    /**
     * 实体类对象的情况
     */
    User getUserByPojo(User user);

    /**
     *  Map集合的情况
     */
    User getUserByMap(Map<String, Object> map);

    /**
     * @ param的情况
     */
    User getUserByParam(@Param("name") String name, @Param("gender") String gender);


}
