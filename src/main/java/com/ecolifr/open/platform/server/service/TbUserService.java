package com.ecolifr.open.platform.server.service;

import com.ecolifr.open.platform.server.domain.TbUser;

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}
