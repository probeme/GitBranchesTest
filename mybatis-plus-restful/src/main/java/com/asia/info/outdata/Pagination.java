package com.asia.outdata;

import lombok.Data;

import java.util.List;

@Data
public class Pagination<T> extends BaseOutData {
    /**
     * 页标
     */
    private long pageNo;
    /**
     * 页面条数
     */
    private long pageSize;
    /**
     * 总条数
     */
    private long total;
    /**
     * 数据
     */
    private List<T> rows;

    public Pagination() {
        this.pageNo = 0;
        this.pageSize = 0;
        this.total = 0;
    }
}
