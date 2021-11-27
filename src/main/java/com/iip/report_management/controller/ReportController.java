package com.iip.report_management.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iip.report_management.controller.utils.Result;
import com.iip.report_management.domain.Report;
import com.iip.report_management.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class ReportController {

    @Autowired
    private IReportService reportService;

    @GetMapping
    public Result getAll() {
        return new Result(true, reportService.list(), null);
    }

    @PostMapping
    public Result save(@RequestBody Report report) {
        boolean flag = reportService.save(report);
        String msg = flag ? "添加成功" : "添加失败";
        return new Result(flag, null, msg);
    }

    @PutMapping
    public Result update(@RequestBody Report report) {
        boolean flag = reportService.updateById(report);
        String msg = flag ? "修改成功" : "修改失败";
        return new Result(flag, null, msg);
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = reportService.removeById(id);
        String msg = flag ? "删除成功" : "删除失败";
        return new Result(flag, null, msg);
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id) {
        Report report = reportService.getById(id);
        String msg = report == null ? null : "数据同步失败，自动刷新";
        return new Result(true, report, msg);
    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public Result getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
//        IPage<Report> page = reportService.getPage(currentPage, pageSize);
//        if(currentPage > page.getPages()) {
//            return new Result(true, reportService.getPage((int)page.getPages(), pageSize), null);
//        }
//        return new Result(true, page, null);
//    }

    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage, @PathVariable int pageSize, Report report) {
        IPage<Report> page = reportService.getPage(currentPage, pageSize, report);
        if(currentPage > page.getPages()) {
            return new Result(true, reportService.getPage((int)page.getPages(), pageSize, report), null);
        }
        return new Result(true, page, null);
    }
}
