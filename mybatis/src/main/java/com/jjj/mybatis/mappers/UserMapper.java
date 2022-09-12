package com.jjj.mybatis.mappers;

import com.jjj.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className: com.jjj.mybatis.mappers.UserMapper
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-12 7:52
 */
public interface UserMapper {

    int insertUser(User user);

    int deleteUser(Integer id);

    int updateUser(User user);
}
