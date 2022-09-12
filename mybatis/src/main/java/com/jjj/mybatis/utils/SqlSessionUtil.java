package com.jjj.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @className: com.jjj.mybatis.utils.SqlSessionUtil
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-12 8:08
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession(boolean isAutoCommit) {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new SqlSessionFactoryBuilder().build(is).openSession(isAutoCommit);
    }

    public static <T> T getMapper(Class<T> tClass) {
        SqlSession sqlSession = getSqlSession(true);
        return sqlSession.getMapper(tClass);
    }
}
