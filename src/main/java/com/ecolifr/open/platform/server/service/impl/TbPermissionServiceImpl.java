package com.ecolifr.open.platform.server.service.impl;

import com.ecolifr.open.platform.server.domain.TbPermission;
import com.ecolifr.open.platform.server.mapper.TbPermissionMapper;
import com.ecolifr.open.platform.server.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
