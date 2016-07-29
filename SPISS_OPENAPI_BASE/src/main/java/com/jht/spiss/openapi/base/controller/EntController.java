package com.jht.spiss.openapi.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by S3 on 2016/7/29.
 */
@RestController
@RequestMapping(value = "/base/ent")
public class EntController {

    @RequestMapping(value="/info")
    public Map<String,Object> getEntInfo(){
        Map<String,Object> res=new HashMap<>();
        res.put("key","hello,boot");
        return res;
    }
}
