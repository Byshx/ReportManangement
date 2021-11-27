package com.iip.report_management.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.iip.report_management.domain.Report;

public interface IReportService extends IService<Report> {
    IPage<Report> getPage(Integer currentPage, Integer pageSize, Report report);
}
