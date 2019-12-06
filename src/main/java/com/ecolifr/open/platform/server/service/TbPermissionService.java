package com.ecolifr.open.platform.server.service;

import com.ecolifr.open.platform.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService {
    default List<TbPermission> selectByUserId(Long userId) {
        return null;
    }
}
