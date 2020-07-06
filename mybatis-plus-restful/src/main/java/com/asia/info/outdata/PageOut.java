package com.asia.outdata;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.List;

@Data
public class PageOut<T> extends BaseOutData {
    private Pagination<T> pagination;

    public void initPagination(Page<T> info, List<T> list) {
        Pagination<T> pagination = new Pagination<T>();
        pagination.setPageNo(info.getCurrent());
        pagination.setPageSize(info.getSize());
        pagination.setTotal(info.getTotal());
        pagination.setRows(list);
        setPagination(pagination);
        setCode("0000");
        setMessage("success");
    }
}
