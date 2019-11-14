package com.quartz.execute;

import com.quartz.service.BaseJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * <p>
 * Job 是 定时任务的具体执行逻辑
 * JobDetail 是 定时任务的定义
 */
@Slf4j
@DisallowConcurrentExecution
public class SayHelloJobLogic implements BaseJob {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //写你自己的逻辑
        log.info("SayHelloJob.execute , hello world  ! ");

    }
}
