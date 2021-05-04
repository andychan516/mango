package com.louis.mango.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.louis.mango.service.SysUserService;

@RestController
@RequestMapping("user")
public class SysUserController {
    Logger logger = LogManager.getLogger(SysUserController.class);

    @Autowired
    private SysUserService sysUserService;
    
    @GetMapping(value="/findAll")
    public Object findAll() {
        logger.info("hehe");
        return sysUserService.findAll();
    }
}