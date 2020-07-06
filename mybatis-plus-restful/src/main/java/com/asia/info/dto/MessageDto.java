package com.asia.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {
    private Integer messageId;
    private String messageTitle;
    //base64字符串
    private String thumbnailUrl;
    private String previewUrl;
    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;

    /**
     * 消息状态 1：启用；2：草稿箱；3：待审核；4：审核驳回；5：停用
     */
    private Integer messageState;

    /**
     * 审核驳回信息
     */
    private String remark;

    /**
     * 操作员标识
     */
    @NotNull
    private Integer createOpId;
}
