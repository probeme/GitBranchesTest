package com.asia.outdata;

import lombok.Data;

import java.io.Serializable;

/**
 * 基础出参
 * @author caiwl
 */
@Data
public class BaseOutData implements Serializable {
    private String code;
    private String message;
    public BaseOutData(){
        code = "0000";
        message="success";
    }
}
