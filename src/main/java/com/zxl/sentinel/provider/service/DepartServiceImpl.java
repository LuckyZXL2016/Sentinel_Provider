package com.zxl.sentinel.provider.service;

import com.zxl.sentinel.provider.bean.Depart;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author zxl
 * @date 2021/9/23.
 */
@Service
public class DepartServiceImpl implements DepartService {

    @Override
    public Depart getDepartById(Integer id) {
        Integer randomId = new Random().nextInt();
        return Depart.builder()
                .id(randomId)
                .name("test_" + randomId)
                .build();
    }
}
