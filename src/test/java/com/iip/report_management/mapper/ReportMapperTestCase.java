package com.iip.report_management.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iip.report_management.domain.Report;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReportMapperTestCase {
    @Autowired
    private ReportMapper reportMapper;

    @Test
    void testGetById() {
        System.out.println(reportMapper.selectById(1));
    }

    @Test
    void testGetBy() {
        String name = null;
        LambdaQueryWrapper<Report> lqw = new LambdaQueryWrapper<>();
        lqw.like(name != null, Report::getName, name);
        System.out.println(reportMapper.selectList(lqw));
    }

    @Test
    void testGetByPage() {
        IPage<Report> page = new Page<>(1, 5);
        reportMapper.selectPage(page, null);
        System.out.println(page.getRecords());
    }
}
