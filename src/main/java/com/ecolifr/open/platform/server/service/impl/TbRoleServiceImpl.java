package com.ecolifr.open.platform.server.service.impl;

import com.ecolifr.open.platform.server.mapper.TbRoleMapper;
import com.ecolifr.open.platform.server.service.TbRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}
