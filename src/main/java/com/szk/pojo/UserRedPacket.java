package com.szk.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Description: 用户抢红包记录表
 * @Author: SZK
 * @Date: 2018/9/1 12:48
 */
@Component("userRedPacket")
public class UserRedPacket implements Serializable {

    private static final long serialVersionUID = 5138260442524213328L;

    private Long id;
    private Long redPacketId;
    private Long userId;
    private Double amount;
    private Timestamp grabTime;
    private String note;

    public UserRedPacket() {
    }

    public UserRedPacket(Long id, Long redPacketId, Long userId, Double amount, Timestamp grabTime, String note) {
        this.id = id;
        this.redPacketId = redPacketId;
        this.userId = userId;
        this.amount = amount;
        this.grabTime = grabTime;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Timestamp getGrabTime() {
        return grabTime;
    }

    public void setGrabTime(Timestamp grabTime) {
        this.grabTime = grabTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "UserRedPacket{" +
                "id=" + id +
                ", redPacketId=" + redPacketId +
                ", userId=" + userId +
                ", amount=" + amount +
                ", grabTime=" + grabTime +
                ", note='" + note + '\'' +
                '}';
    }
}
