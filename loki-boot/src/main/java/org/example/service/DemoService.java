package org.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private final String baseUrl = "http://localhost:3100";
    private final Logger LOG = LoggerFactory.getLogger(DemoService.class);

    public void log(){
        LOG.info("DemoService.log invoked");
    }
}
