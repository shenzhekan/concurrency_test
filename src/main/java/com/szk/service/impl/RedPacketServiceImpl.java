package com.szk.service.impl;

import com.szk.mapper.RedPacketMapper;
import com.szk.pojo.RedPacket;
import com.szk.service.RedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @Author: SZK
 * @Date: 2018/9/1 21:49
 */
@Service("redPacketService")
public class RedPacketServiceImpl implements RedPacketService {

    @Autowired
    private RedPacketMapper redPacketMapper;

    /**
     * 获得红包信息
     * @param id ：红包编号
     * @return ：返回红包信息
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,
                    propagation = Propagation.REQUIRED)
    public RedPacket getRedPacket(Long id) {
        return redPacketMapper.getRedPacket(id);
    }
    /**
     * 更新红包个数
     * @param id ：红包编号
     * @return ：影响的个数
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,
                    propagation = Propagation.REQUIRED)
    public int decreaseRedPacket(Long id) {
        return redPacketMapper.decreaseRedPacket(id);
    }
}
