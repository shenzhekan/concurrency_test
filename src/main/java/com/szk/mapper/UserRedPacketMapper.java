package com.szk.mapper;

import com.szk.pojo.UserRedPacket;
import org.springframework.stereotype.Repository;

/**
 * @Description: �������Ϣ�Ĳ���
 * @Author: SZK
 * @Date: 2018/9/1 21:31
 */
@Repository
public interface UserRedPacketMapper {

    /**
     * �������������Ϣ
     * @param userRedPacket ���������Ϣ
     * @return ��Ӱ��ļ�¼��
     */
    int grabRedPacket(UserRedPacket userRedPacket);


}
