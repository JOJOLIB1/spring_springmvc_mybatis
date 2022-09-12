package com.jjj.mybatis.mappersTest;

import com.jjj.mybatis.mappers.SelectMapper;
import com.jjj.mybatis.utils.SqlSessionUtil;
import org.junit.jupiter.api.Test;

/**
 * @className: com.jjj.mybatis.mappersTest.SelectMapperTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-09-12 21:46
 */
public class SelectMapperTest {
    @Test
    public void testQuery() {
        SelectMapper mapper = SqlSessionUtil.getMapper(SelectMapper.class);
//        System.out.println(mapper.getUserToMap(3));
//        System.out.println(mapper.getUserToPojo(3));
//        System.out.println(mapper.getUserToList(3));
        mapper.getAllUserToList().forEach(System.out::println);
        System.out.println(mapper.getAllUserToMap());
        mapper.getAllUserToListMap().forEach(System.out::println);
    }
}
