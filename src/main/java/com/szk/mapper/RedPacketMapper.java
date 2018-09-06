package com.szk.mapper;

import com.szk.pojo.RedPacket;
import org.springframework.stereotype.Repository;

/**
 * @Description: 发红包信息的操作
 * @Author: SZK
 * @Date: 2018/9/1 12:57
 */
@Repository
public interface RedPacketMapper {

    /**
     * 获取红包信息
     * @param id ：红包ID
     * @return ：红包具体信息
     */
     RedPacket getRedPacket(Long id);

    /**
     * 扣减红包数
     * @param id ：红包ID
     * @return ：更新红包个数
     */
    int decreaseRedPacket(Long id);

}
