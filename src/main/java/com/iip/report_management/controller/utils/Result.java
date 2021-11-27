package com.iip.report_management.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 前后端数据协议
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Boolean flag;
    private Object data;
    private String msg;

    public Result(Boolean flag) {
        this.flag = flag;
    }

    public Result(String msg) {
        this.flag = false;
        this.msg = msg;
    }
}
