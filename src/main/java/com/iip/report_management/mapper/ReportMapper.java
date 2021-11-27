package com.iip.report_management.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iip.report_management.domain.Report;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ReportMapper extends BaseMapper<Report> {

}
