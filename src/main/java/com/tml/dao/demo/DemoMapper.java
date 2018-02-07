package com.tml.dao.demo;

import java.util.List;
import java.util.Map;

public interface DemoMapper {
    /**
     * 获取一个demo样例
     * @param
     * @return
     */
    Map getDemo(Map map);

    /**
     * 分页查询
     * @return
     */
    List<Map> demoList();
}
