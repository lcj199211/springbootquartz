package com.quartz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quartz.dao.UrlConfigMapper;
import com.quartz.model.UrlConfig;
import com.quartz.service.UrlConfigService;
import com.quartz.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

@Service(value = "userService")
public class UulConfigServiceImpl implements UrlConfigService {

    @Resource
    private UrlConfigMapper urlConfigMapper;//这里会报错，idea的纠错机制在解析spring通过命名约定的方式进行配置时,支持的并不是太友好,但是并不会影响


    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<UrlConfig> findAllUrlConfig(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了。
        PageHelper.startPage(pageNum, pageSize);
        List<UrlConfig> urlConfig = urlConfigMapper.findAllUrlConfig();
        PageInfo result = new PageInfo(urlConfig);
        return result;
    }

    @Override
    public UrlConfig selectByMark(String mark) {
        return urlConfigMapper.selectByMark(mark);
    }


}

