package com.szk.controller;

import com.szk.service.UserRedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 页面抢红包控制器
 * @Author: SZK
 * @Date: 2018/9/3 18:47
 */
@Component("/userRedPacket")
@RequestMapping("/userRedPacket")
public class GrabRedPacketController {

    @Autowired
    private UserRedPacketService userRedPacketService;

    /**
     * 抢红包的调用方法
     * @param redPacketId
     * @param userId
     * @return
     */
    @RequestMapping("/grabRedPacket")
    @ResponseBody
    public Map<String, Object> grabRedPacket(Long redPacketId, Long userId){
        // 返回影响条数
        int result = userRedPacketService.grabRedPacket(redPacketId, userId);
        Map<String, Object> resultMap = new HashMap<>();
        boolean flag = result > 0;
        resultMap.put("success", flag);
        resultMap.put("message", flag ? "成功":"失败");
        return resultMap;
    }

    @RequestMapping("/test")
    public String getIndex(){
        System.out.println("主页打开");
        return "test";
    }

}
