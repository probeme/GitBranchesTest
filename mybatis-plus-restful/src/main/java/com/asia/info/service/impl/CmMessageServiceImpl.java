package com.asia.service.impl;

import com.asia.dto.MessageDto;
import com.asia.mapper.CmMessageMapper;
import com.asia.po.CmMessage;
import com.asia.service.CmMessageService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @ClassName CmMessageServiceImpl
 * @Description
 * @Author wangbin
 * @Date 2020/6/28 22:01
 */
@Service
public class CmMessageServiceImpl implements CmMessageService {
    @Autowired
    private CmMessageMapper mapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void addMessage(MessageDto messageDto) {
        CmMessage message = new CmMessage();
        BeanUtils.copyProperties(messageDto, message);
        message.setModifyTime(new Date());
        message.setMessageState(2);
        message.setCreateOpId(10086);
        mapper.insert(message);
    }

    @Override
    public MessageDto messageDetail(Integer messageId) {
        return null;
    }

    @Override
    public void editMessage(MessageDto messageDto, Integer messageId) {

    }

    @Override
    public Page<MessageDto> queryAllMessage(Integer pageNo, Integer pageSize, String messageState, String messageTitle) {
        return null;
    }

    @Override
    public void changeMessageState(Integer messageId) {

    }
}
