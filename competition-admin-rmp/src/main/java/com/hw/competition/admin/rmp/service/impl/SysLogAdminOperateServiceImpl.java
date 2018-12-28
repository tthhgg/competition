
package com.hw.competition.admin.rmp.service.impl;

import com.hw.competition.admin.rmp.mapper.SysLogAdminOperateMapper;
import com.hw.competition.admin.rmp.model.SysLogAdminOperate;
import com.hw.competition.admin.rmp.service.SysLogAdminOperateService;
import com.hw.competition.core.service.CommonServiceImpl;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* 代码为自动生成 Created by www.magicalcoder.com
* 如果你改变了此类 read 请将此行删除
* 欢迎加入官方QQ群:323237052
*/

@Service
public class SysLogAdminOperateServiceImpl extends CommonServiceImpl<SysLogAdminOperate,Long> implements SysLogAdminOperateService,InitializingBean{
    @Resource
    private SysLogAdminOperateMapper sysLogAdminOperateMapper;



    @Override
    public void afterPropertiesSet() {
        super.commonMapper = sysLogAdminOperateMapper;
    }
}
