package com.asia.service;

import com.asia.dto.MessageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface CmMessageService {
    /**
     * 新增消息
     *
     * @param messageDto
     */
    void addMessage(MessageDto messageDto);

    /**
     * 消息详情
     *
     * @param messageId Integer
     */
    MessageDto messageDetail(Integer messageId);

    /**
     * 编辑消息
     *
     * @param messageDto
     */
    void editMessage(MessageDto messageDto, Integer messageId);


    /**
     * 分页查询所有消息
     *
     * @param pageNo
     * @param pageSize
     * @param messageState
     * @param messageTitle
     * @return
     */
    Page<MessageDto> queryAllMessage(Integer pageNo, Integer pageSize, String messageState, String messageTitle);


    /**
     * 消息状态修改
     *
     * @param messageId
     */
    void changeMessageState(Integer messageId);


}
