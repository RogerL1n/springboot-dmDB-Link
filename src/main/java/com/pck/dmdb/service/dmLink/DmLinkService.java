package com.pck.dmdb.service.dmLink;

import com.pck.dmdb.dto.ResultDTO;

import java.math.BigInteger;

/**
 * @program: dmdb
 * @description: 测试
 * @author: Pck
 * @create: 2022-08-24 09:28
 **/


public interface DmLinkService {


    ResultDTO getDmInfo(String cellId, BigInteger beginTime, BigInteger endTime);

    ResultDTO getDmInfoByCi(String cellId, BigInteger beginTime, BigInteger endTime);

    ResultDTO getDailyAmountByCi(String cellId, BigInteger beginTime, BigInteger endTime);
}
