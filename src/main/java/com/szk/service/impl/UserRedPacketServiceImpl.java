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
 * @Description: ��������������������Ϣ
 * @Author: SZK
 * @Date: 2018/9/1 22:12
 */
@Service("userRedPacketService")
public class UserRedPacketServiceImpl implements UserRedPacketService {

    // �������Ϣ����
    @Autowired
    private UserRedPacketMapper userRedPacketMapper;

    // �����Ϣ����
    @Autowired
    private RedPacketMapper redPacketMapper;

    /**
     * ������Ĳ���ҵ��
     *  1����ѯ�����Ϣ���Ƿ���ʣ��ĺ����
     *  2���ۼ���������������������Ϣ
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
            // �ۼ��������
            redPacketMapper.decreaseRedPacket(redPacketId);
            // ��װ�������Ϣ����
            UserRedPacket userRedPacket = new UserRedPacket();
            userRedPacket.setRedPacketId(redPacketId);
            userRedPacket.setId(userId);
            userRedPacket.setAmount(redPacket.getUnitAmount());
            userRedPacket.setNote("�������"+redPacketId);
            // �����������Ϣ
            int result = userRedPacketMapper.grabRedPacket(userRedPacket);
            return result;
        }
        return 0;
    }
}
