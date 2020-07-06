package com.asia.controller;

import com.asia.dto.MessageDto;
import com.asia.outdata.BaseOutData;
import com.asia.outdata.DataOutPut;
import com.asia.outdata.Pagination;
import com.asia.service.CmMessageService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author wangbin
 */
@RestController
@RequestMapping("/api/migu")
@Slf4j
public class MessageController {
    @Autowired
    private CmMessageService cmMessageService;

    //消息新增
    @PostMapping("/message")
    public BaseOutData addMessage(@RequestBody MessageDto messageDto) {
        LocalDateTime beginTime = LocalDateTime.now();
        cmMessageService.addMessage(messageDto);
        Long timeConsuming = Duration.between(beginTime, LocalDateTime.now()).toMillis();
        log.info("addMessage执行时间：{}", timeConsuming);
        return new BaseOutData();
    }


    //查询消息详情
    @GetMapping("/message/{messageId}")
    public DataOutPut messageDetail(@PathVariable Integer messageId) {
        LocalDateTime beginTime = LocalDateTime.now();
        MessageDto messageDto = cmMessageService.messageDetail(messageId);
        Long timeConsuming = Duration.between(beginTime, LocalDateTime.now()).toMillis();
        log.info("messageDetail执行时间：{}", timeConsuming);
        return new DataOutPut<>(messageDto);
    }

    @PutMapping("/message/{id}")
    public BaseOutData editMessage(@RequestBody MessageDto messageDto, @PathVariable("id") Integer messageId) {
        LocalDateTime beginTime = LocalDateTime.now();
        cmMessageService.editMessage(messageDto, messageId);
        Long timeConsuming = Duration.between(beginTime, LocalDateTime.now()).toMillis();
        log.info("执行时间：{}", timeConsuming);
        return new BaseOutData();
    }

    @GetMapping("/message")
    public Pagination queryAllMessage(@RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                      @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                      @RequestParam(value = "messageState", required = true) String messageState,
                                      @RequestParam(value = "messageTitle", required = false) String messageTitle) {
        Page<MessageDto> cmMessagePage = cmMessageService.queryAllMessage(pageNo, pageSize, messageState, messageTitle);
        Pagination pagination = new Pagination();
        pagination.setTotal(cmMessagePage.getTotal());
        pagination.setPageNo(pageNo);
        pagination.setPageSize(pageSize);
        pagination.setRows(cmMessagePage.getRecords());
        return pagination;
    }

    @PutMapping("/message/{id}/state")
    public BaseOutData changeMessageState(@PathVariable("id") Integer messageId) {
        cmMessageService.changeMessageState(messageId);
        return new BaseOutData();
    }
}
