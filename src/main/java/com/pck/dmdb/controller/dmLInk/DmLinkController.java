package com.pck.dmdb.controller.dmLInk;


import com.pck.dmdb.dto.ResultDTO;
import com.pck.dmdb.service.dmLink.DmLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;


/**
 * @program: dmdb
 * @description: 测试类
 * @author: Pck
 * @create: 2022-08-23 15:27
 **/

@RestController
@RequestMapping("/getInfo")
public class DmLinkController {

    @Autowired
    private DmLinkService dmLinkService;

    @PostMapping("/data")
    public ResultDTO getInfo(@RequestParam String cellId, @RequestParam BigInteger beginTime, @RequestParam BigInteger endTime) {


        ResultDTO info = this.dmLinkService.getDmInfo(cellId, beginTime, endTime);
        return info;
    }


    @PostMapping("/data/ci")
    public ResultDTO getInfoByCi(@RequestParam String cellId, @RequestParam BigInteger beginTime, @RequestParam BigInteger endTime) {

        ResultDTO info = this.dmLinkService.getDmInfoByCi(cellId, beginTime, endTime);
        return info;
    }


    @PostMapping("/data/amount")
    public ResultDTO getDailyInfoByCi(@RequestParam String cellId, @RequestParam BigInteger beginTime, @RequestParam BigInteger endTime) {

        ResultDTO info = this.dmLinkService.getDailyAmountByCi(cellId, beginTime, endTime);
        return info;
    }

}
