package com.szk.mapper;

import com.szk.pojo.UserRedPacket;
import org.springframework.stereotype.Repository;

/**
 * @Description: 抢红包信息的操作
 * @Author: SZK
 * @Date: 2018/9/1 21:31
 */
@Repository
public interface UserRedPacketMapper {

    /**
     * 插入抢红包的信息
     * @param userRedPacket ：抢红包信息
     * @return ：影响的记录数
     */
    int grabRedPacket(UserRedPacket userRedPacket);


}
