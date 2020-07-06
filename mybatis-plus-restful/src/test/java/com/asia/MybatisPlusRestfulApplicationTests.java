package com.asia;

import com.asia.controller.MessageController;
import com.asia.dto.MessageDto;
import com.asia.service.CmMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisPlusRestfulApplicationTests {

    @Autowired
    private MessageController messageController;

    @Autowired
    private CmMessageService service;

    @Test
    public void addMessageController() {
        MessageDto messageDto = new MessageDto();
        messageDto.setMessageTitle("消息标题");
        messageDto.setThumbnailUrl("https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3892521478,1695688217&fm=26&gp=0.jpg");
        messageDto.setPreviewUrl("https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3892521478,1695688217&fm=26&gp=0.jpg");
        messageController.addMessage(messageDto);
    }

    @Test
    public void addMessageService() {
        MessageDto messageDto = new MessageDto();
        messageDto.setMessageTitle("消息标题");
        messageDto.setThumbnailUrl("https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3892521478,1695688217&fm=26&gp=0.jpg");
        messageDto.setPreviewUrl("https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3892521478,1695688217&fm=26&gp=0.jpg");
        service.addMessage(messageDto);
    }
}
