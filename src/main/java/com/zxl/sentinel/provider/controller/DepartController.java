package com.zxl.sentinel.provider.controller;

import com.zxl.sentinel.provider.bean.Depart;
import com.zxl.sentinel.provider.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxl
 * @date 2021/9/23.
 */
@RestController
public class DepartController {

    @Autowired
    DepartService departServiceImpl;

    @GetMapping("/provider/depart/get/{id}")
    public Depart getHandle(@PathVariable("id") int id) {
        return departServiceImpl.getDepartById(id);
    }

}