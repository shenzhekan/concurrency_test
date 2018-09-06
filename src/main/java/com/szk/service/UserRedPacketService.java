package com.szk.service;

import org.springframework.stereotype.Service;

/**
 * @Description: 扣减红包的业务操作
 * @Author: SZK
 * @Date: 2018/9/1 22:06
 */
@Service("userRedPacketService")
public interface UserRedPacketService {

    /**
     * 保存抢红包信息
     * @param redPacketId
     * @param userId
     * @return
     */
    int grabRedPacket(Long redPacketId, Long userId);

}
