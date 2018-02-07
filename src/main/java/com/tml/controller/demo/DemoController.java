package com.tml.controller.demo;

import com.tml.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DemoService demoService;

    @RequestMapping("log")
    public String log() {
        logger.debug("this is DEBUG log");
        logger.info("this is INFO log");
        logger.error("this is ERROR log");
        logger.trace("this is TRACE log");
        logger.warn("this is WARN log");
        return "success";
    }
    @RequestMapping("list")
    public Map list() {
        return demoService.demoList();
    }
}
