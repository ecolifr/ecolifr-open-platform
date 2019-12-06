package com.ecolifr.open.platform.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Xie ZuoZhi
 * @date 2019/6/6 14:55
 */
@RestController
public class UserController {

//    @RequestMapping("/user/me")
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }
}