package com.pck.dmdb.mapper.dmLink;

import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: dmdb
 * @description: 测试
 * @author: Pck
 * @create: 2022-08-24 09:35
 **/

@Mapper
public interface DmLinkMapper {

    /**
     * Desc: 获取一定时间内的 某个小区 6个字段信息  经纬度非空
     *
     * @param cellId    小区ci
     * @param beginTime 检索起始时间 2022083100
     * @param endTime   检索结束时间 2022083124
     * @return {@link List< LinkedHashMap< String, Object>>}
     * @author PCK
     * @date 2022/9/2 11:15
     */
    List<LinkedHashMap<String, Object>> getAllInfoFromTable(String cellId, BigInteger beginTime, BigInteger endTime);

    /**
     * Desc: 获取所有的信息 经纬度非空
     *
     * @param cellId    小区ci
     * @param beginTime 检索起始时间 2022083100
     * @param endTime   检索结束时间 2022083124
     * @return {@link List< Map< String, Object>>}
     * @author PCK
     * @date 2022/9/2 11:17
     */
    List<Map<String, Object>> getAllInfoFromTableByCI(String cellId, BigInteger beginTime, BigInteger endTime);

    /**
     * Desc: 按时间排序 经纬度非空
     *
     * @param cellId    小区ci
     * @param beginTime 检索起始时间 2022083100
     * @param endTime   检索结束时间 2022083124
     * @return {@link List< Map< String, Object>>}
     * @author PCK
     * @date 2022/9/2 11:19
     */
    List<Map<String, Object>> getAllInfoByCIOrderByTimeAsc(String cellId, BigInteger beginTime, BigInteger endTime);

    /**
     * Desc: 获取一点 该小区 经纬度非空的数据量
     *
     * @param cellId    小区ci
     * @param beginTime 检索起始时间 2022083100
     * @param endTime   检索结束时间 2022083124
     * @return Integer
     * @author PCK
     * @date 2022/9/2 11:20
     */
    Integer getOneDayDataAmountByCI(String cellId, BigInteger beginTime, BigInteger endTime);
}
