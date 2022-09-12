package com.pck.dmdb.service.test;

import com.pck.dmdb.dto.ResultDTO;

import java.math.BigInteger;

/**
 * @program: dmdb
 * @description: 测试
 * @author: Pck
 * @create: 2022-08-24 09:28
 **/


public interface TestService {


    ResultDTO test(String cellId, BigInteger beginTime, BigInteger endTime);
}
