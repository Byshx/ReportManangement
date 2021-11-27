package com.iip.report_management.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Report {
    private Integer id;
    private String type;
    private String name;
    private String context;
    private Date time;
}
