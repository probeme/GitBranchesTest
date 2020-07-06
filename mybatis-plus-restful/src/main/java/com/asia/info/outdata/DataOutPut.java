package com.asia.outdata;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataOutPut<T> extends BaseOutData{
    private T data;
    public DataOutPut(){
        super();
    }
}
