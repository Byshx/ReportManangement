package com.iip.report_management.service;

import com.iip.report_management.domain.Report;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReportServiceTestCase {

    @Autowired
    private IReportService reportService;

    @Test
    void testGetById() {
        System.out.println(reportService.getById(2));
    }

    @Test
    void testSave() {
        Report report = new Report();
        report.setName("赵云");
        report.setType("周报");
        report.setContext("五杀");
        System.out.println(reportService.save(report));
    }
}
