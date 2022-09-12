package com.jjj.mybatis.mappers;

import com.jjj.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @className: com.jjj.mybatis.mappers.SelectMapper
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-12 21:46
 */
public interface SelectMapper {
    /**
     * 查询单个对象
     * map方式
     */

    Map<String, Object> getUserToMap(@Param("id") Integer id);

    /**
     * 查询单个对象
     * pojo方式
     */

    User getUserToPojo(@Param("id") Integer id);

    /**
     * 查询单个对象
     * List方式
     */

    List<User> getUserToList(@Param("id") Integer id);

    /**
     * 查询多个对象
     * List方式
     */
    List<User> getAllUserToList();

    /**
     * 查询单个对象
     * map方式
     */
    @MapKey("id")
    Map<String, Object> getAllUserToMap();

    /**
     * 查询单个对象
     * List + Map方式
     */
    List<Map<String, Object>> getAllUserToListMap();

    /**
     * 查询单个对象
     * 组函数
     */

    int getCount();
}
