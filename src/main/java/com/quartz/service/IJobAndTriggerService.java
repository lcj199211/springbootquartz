package com.quartz.service;

import com.github.pagehelper.PageInfo;
import com.quartz.model.JobAndTrigger;

/**
 * 管理列表
 */
public interface IJobAndTriggerService {
    PageInfo<JobAndTrigger> getJobAndTriggerDetails(Integer pageNum, Integer pageSize);
}
