package com.szk.controller;

import com.szk.service.UserRedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: ҳ�������������
 * @Author: SZK
 * @Date: 2018/9/3 18:47
 */
@Component("/userRedPacket")
@RequestMapping("/userRedPacket")
public class GrabRedPacketController {

    @Autowired
    private UserRedPacketService userRedPacketService;

    /**
     * ������ĵ��÷���
     * @param redPacketId
     * @param userId
     * @return
     */
    @RequestMapping("/grabRedPacket")
    @ResponseBody
    public Map<String, Object> grabRedPacket(Long redPacketId, Long userId){
        // ����Ӱ������
        int result = userRedPacketService.grabRedPacket(redPacketId, userId);
        Map<String, Object> resultMap = new HashMap<>();
        boolean flag = result > 0;
        resultMap.put("success", flag);
        resultMap.put("message", flag ? "�ɹ�":"ʧ��");
        return resultMap;
    }

    @RequestMapping("/test")
    public String getIndex(){
        System.out.println("��ҳ��");
        return "test";
    }

}
