package com.tml.service.impl;

import com.tml.dao.demo.DemoMapper;
import com.tml.service.DemoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoMapper demoMapper;

    @Override
    public Map demoList() {
        PageHelper.startPage(2,1);
        List<Map> maps = demoMapper.demoList();
        Map result = new HashMap<>();
        result.put("data",maps);
        return result;
    }
}
