package com.iip.report_management.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iip.report_management.domain.Report;

import java.util.List;

public interface ReportService {
    boolean save(Report report);
    boolean update(Report report);
    boolean delete(Integer id);
    Report getById(Integer id);
    List<Report> getAll();
    IPage<Report> getPage(Integer currentPage, Integer pageSize);
}
