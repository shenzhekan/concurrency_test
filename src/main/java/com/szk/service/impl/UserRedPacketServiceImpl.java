package com.szk.service.impl;

import com.szk.mapper.RedPacketMapper;
import com.szk.mapper.UserRedPacketMapper;
import com.szk.pojo.RedPacket;
import com.szk.pojo.UserRedPacket;
import com.szk.service.UserRedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 抢红包，并保存抢红包信息
 * @Author: SZK
 * @Date: 2018/9/1 22:12
 */
@Service("userRedPacketService")
public class UserRedPacketServiceImpl implements UserRedPacketService {

    // 抢红包信息操作
    @Autowired
    private UserRedPacketMapper userRedPacketMapper;

    // 红包信息操作
    @Autowired
    private RedPacketMapper redPacketMapper;

    /**
     * 抢红包的操作业务：
     *  1、查询红包信息中是否还有剩余的红包数
     *  2、扣减红包，并保存抢红包的信息
     * @param redPacketId
     * @param userId
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,
                    propagation = Propagation.REQUIRED)
        public int grabRedPacket(Long redPacketId, Long userId) {
        RedPacket redPacket = redPacketMapper.getRedPacket(redPacketId);
        if(redPacket.getStock() > 0){
            // 扣减红包操作
            redPacketMapper.decreaseRedPacket(redPacketId);
            // 封装抢红包信息操作
            UserRedPacket userRedPacket = new UserRedPacket();
            userRedPacket.setRedPacketId(redPacketId);
            userRedPacket.setId(userId);
            userRedPacket.setAmount(redPacket.getUnitAmount());
            userRedPacket.setNote("抢红包："+redPacketId);
            // 插入抢红包信息
            int result = userRedPacketMapper.grabRedPacket(userRedPacket);
            return result;
        }
        return 0;
    }
}
