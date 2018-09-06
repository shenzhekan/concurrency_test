package com.szk.service;

import com.szk.pojo.RedPacket;
import org.springframework.stereotype.Service;

/**
 * @Description: 红包信息的业务操作（红包个数的限制）
 * @Author: SZK
 * @Date: 2018/9/1 21:45
 */
@Service("redPacketService")
public interface RedPacketService {

    /**
     * 获取红包
     * @param id ：红包编号
     * @return ：红包信息
     */
     RedPacket getRedPacket(Long id);

    /**
     * 扣减红包
     * @param id ：红包编号
     * @return ：影响条数
     */
     int decreaseRedPacket(Long id);
}
