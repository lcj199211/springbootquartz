package com.quartz.util;

import com.quartz.model.UrlConfig;
import com.quartz.service.UrlConfigService;
import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class UrlUtil {
    @Resource
    private static UrlConfigService urlConfigService;
    /**
     * http url管理
     * @param
     * @return  string
     */
    public static Map<String,Object> getUrl(String mark) {
        Map<String,Object> map=new HashMap<String,Object>();
        try {
            UrlConfig urlConfig= urlConfigService.selectByMark(mark);
            if (urlConfig !=null) {
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHH");
                String t = simpleDateFormat.format(date);
                String username = urlConfig.getUser();
                String code = urlConfig.getUsercode();
                String secreteKey = urlConfig.getSeckey();
                String urlPrefix=urlConfig.getUrlPrefix();
                String urlSuffix = urlConfig.getUrlSuffix();
                String auth_token = MD5.sign(username, "", "utf-8");
                auth_token = MD5.sign((auth_token + secreteKey + code + t),"", "utf-8");
                String url=urlPrefix+urlSuffix+"?" + "t=" + t + "&code=" + code + "&auth_token=" + auth_token;
                System.out.print(url);
                map.put("status",1);
                map.put("data",url);
            }else {
                map.put("status",0);
                map.put("data","url配置文件异常");
            }
        } catch (Exception e) {
            map.put("status",0);
            map.put("data",e);
            e.printStackTrace();
        }
        return map;
    }
}
