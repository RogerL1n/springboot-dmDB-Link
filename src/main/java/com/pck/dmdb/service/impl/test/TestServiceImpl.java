package com.pck.dmdb.service.impl.test;

import com.pck.dmdb.dto.ResultDTO;
import com.pck.dmdb.mapper.test.TestMapper;
import com.pck.dmdb.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * @program: dmdb
 * @description: 测试
 * @author: Pck
 * @create: 2022-08-24 09:27
 **/

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public ResultDTO test(String cellId, BigInteger beginTime, BigInteger endTime) {
        List<Map<String, Object>> allInfoFromTable = testMapper.getAllInfoFromTable(cellId, beginTime, endTime);
        return ResultDTO.ok("ok").setData("info", allInfoFromTable);
    }


}
