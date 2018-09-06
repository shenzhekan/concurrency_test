package com.szk.mapper;

import com.szk.pojo.RedPacket;
import org.springframework.stereotype.Repository;

/**
 * @Description: �������Ϣ�Ĳ���
 * @Author: SZK
 * @Date: 2018/9/1 12:57
 */
@Repository
public interface RedPacketMapper {

    /**
     * ��ȡ�����Ϣ
     * @param id �����ID
     * @return �����������Ϣ
     */
     RedPacket getRedPacket(Long id);

    /**
     * �ۼ������
     * @param id �����ID
     * @return �����º������
     */
    int decreaseRedPacket(Long id);

}
