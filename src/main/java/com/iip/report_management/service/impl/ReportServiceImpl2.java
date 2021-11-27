package com.iip.report_management.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iip.report_management.domain.Report;
import com.iip.report_management.mapper.ReportMapper;
import com.iip.report_management.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl2 implements ReportService {
    @Autowired
    private ReportMapper reportMapper;

    @Override
    public boolean save(Report report) {
        return reportMapper.insert(report) > 0;
    }

    @Override
    public boolean update(Report report) {
        return reportMapper.updateById(report) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return reportMapper.deleteById(id) > 0;
    }

    @Override
    public Report getById(Integer id) {
        return reportMapper.selectById(id);
    }

    @Override
    public List<Report> getAll() {
        return reportMapper.selectList(null);
    }

    @Override
    public IPage<Report> getPage(Integer currentPage, Integer pageSize) {
        IPage<Report> page = new Page<>(currentPage, pageSize);
        return reportMapper.selectPage(page, null);
    }
}
