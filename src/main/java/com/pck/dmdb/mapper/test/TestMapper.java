package com.pck.dmdb.mapper.test;

import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * @program: dmdb
 * @description: 测试
 * @author: Pck
 * @create: 2022-08-24 09:35
 **/

@Mapper
public interface TestMapper {


    List<Map<String, Object>> getAllInfoFromTable(String cellId, BigInteger beginTime, BigInteger endTime);


}
