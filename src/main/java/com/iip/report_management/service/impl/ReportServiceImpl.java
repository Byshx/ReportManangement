package com.iip.report_management.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iip.report_management.domain.Report;
import com.iip.report_management.mapper.ReportMapper;
import com.iip.report_management.service.IReportService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl extends ServiceImpl<ReportMapper, Report> implements IReportService {

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public IPage<Report> getPage(Integer currentPage, Integer pageSize, Report report) {
        LambdaQueryWrapper<Report> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(report.getType()), Report::getType, report.getType());
        lqw.like(Strings.isNotEmpty(report.getName()), Report::getName, report.getName());
        lqw.like(Strings.isNotEmpty(report.getContext()), Report::getContext, report.getContext());
        IPage<Report> page = new Page<Report>(currentPage, pageSize);
        return reportMapper.selectPage(page, lqw);
    }

}
