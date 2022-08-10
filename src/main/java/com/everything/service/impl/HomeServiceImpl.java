package com.everything.service.impl;

import com.everything.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public String greetings() {
        return "Hello sir";
    }
}
