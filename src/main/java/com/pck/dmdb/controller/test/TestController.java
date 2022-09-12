package com.pck.dmdb.controller.test;


import com.pck.dmdb.dto.ResultDTO;
import com.pck.dmdb.service.test.TestService;
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
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/test")
    public ResultDTO getInfo(@RequestParam String cellId, @RequestParam BigInteger beginTime, @RequestParam BigInteger endTime) {
        ResultDTO info = testService.test(cellId, beginTime, endTime);

        return info;
    }

}
