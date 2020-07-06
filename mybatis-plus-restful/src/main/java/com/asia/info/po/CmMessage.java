package com.asia.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangbin
 */
@Data
@TableName("cm_message")
public class CmMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 消息ID
     */
    @TableId(value = "message_id", type = IdType.AUTO)
    private Integer messageId;

    /**
     * 消息标题
     */
    private String messageTitle;

    /**
     * 消息状态 1：启用；2：草稿箱；3：待审核；4：审核驳回；5：停用
     */
    private Integer messageState;

    /**
     * 1：有效；2：废弃
     */
    private Integer dataState;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作员标识
     */
    private Integer createOpId;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;

    /**
     * 失效时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date expireTime;

    /**
     * 生效时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date validTime;

    /**
     * 缩略图地址
     */
    private String thumbnailUrl;

    /**
     * 预览图地址
     */
    private String previewUrl;
}