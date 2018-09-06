package com.szk.service;

import com.szk.pojo.RedPacket;
import org.springframework.stereotype.Service;

/**
 * @Description: �����Ϣ��ҵ�������������������ƣ�
 * @Author: SZK
 * @Date: 2018/9/1 21:45
 */
@Service("redPacketService")
public interface RedPacketService {

    /**
     * ��ȡ���
     * @param id ��������
     * @return �������Ϣ
     */
     RedPacket getRedPacket(Long id);

    /**
     * �ۼ����
     * @param id ��������
     * @return ��Ӱ������
     */
     int decreaseRedPacket(Long id);
}
