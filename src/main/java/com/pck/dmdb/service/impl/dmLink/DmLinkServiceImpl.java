package com.pck.dmdb.service.impl.dmLink;

import com.pck.dmdb.dto.ResultDTO;
import com.pck.dmdb.mapper.dmLink.DmLinkMapper;
import com.pck.dmdb.service.dmLink.DmLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: dmdb
 * @description: 测试
 * @author: Pck
 * @create: 2022-08-24 09:27
 **/

@Service
public class DmLinkServiceImpl implements DmLinkService {

    @Autowired
    private DmLinkMapper dmLinkMapper;


    @Override
    public ResultDTO getDmInfo(String cellId, BigInteger beginTime, BigInteger endTime) {
        List<LinkedHashMap<String, Object>> allInfoFromTable = dmLinkMapper.getAllInfoFromTable(cellId, beginTime, endTime);
        return ResultDTO.ok("ok").setData("info", allInfoFromTable);
    }


    @Override
    public ResultDTO getDmInfoByCi(String cellId, BigInteger beginTime, BigInteger endTime) {
        List<Map<String, Object>> allInfoFromTableByCi = dmLinkMapper.getAllInfoFromTableByCI(cellId, beginTime, endTime);
        return ResultDTO.ok("ok").setData("info", allInfoFromTableByCi);

    }


    @Override
    public ResultDTO getDailyAmountByCi(String cellId, BigInteger beginTime, BigInteger endTime) {
        Integer oneDayDataAmountByCI = dmLinkMapper.getOneDayDataAmountByCI(cellId, beginTime, endTime);
        dmLinkMapper.getOneDayDataAmountByCI(cellId, beginTime, endTime);
        return ResultDTO.ok("ok").setData("dataAmount", oneDayDataAmountByCI);

    }


}
