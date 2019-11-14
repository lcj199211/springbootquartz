package com.quartz.service;

import com.github.pagehelper.PageInfo;
import com.quartz.model.UrlConfig;

public interface UrlConfigService {


    PageInfo<UrlConfig> findAllUrlConfig(int pageNum, int pageSize);


    UrlConfig selectByMark(String mark);
}
