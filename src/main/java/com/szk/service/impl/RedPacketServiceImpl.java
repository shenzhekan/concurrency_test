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
     * ��ú����Ϣ
     * @param id ��������
     * @return �����غ����Ϣ
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,
                    propagation = Propagation.REQUIRED)
    public RedPacket getRedPacket(Long id) {
        return redPacketMapper.getRedPacket(id);
    }
    /**
     * ���º������
     * @param id ��������
     * @return ��Ӱ��ĸ���
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,
                    propagation = Propagation.REQUIRED)
    public int decreaseRedPacket(Long id) {
        return redPacketMapper.decreaseRedPacket(id);
    }
}
