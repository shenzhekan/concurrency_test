package com.szk.service;

import org.springframework.stereotype.Service;

/**
 * @Description: �ۼ������ҵ�����
 * @Author: SZK
 * @Date: 2018/9/1 22:06
 */
@Service("userRedPacketService")
public interface UserRedPacketService {

    /**
     * �����������Ϣ
     * @param redPacketId
     * @param userId
     * @return
     */
    int grabRedPacket(Long redPacketId, Long userId);

}
