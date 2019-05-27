package com.ww.myapp.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ww.myapp.entity.rs.ResponseMsg;
import com.ww.myapp.entity.rs.ReturnData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setResponseDate(new Date());

        ReturnData data = new ReturnData();
        data.setPage(9);
        data.setCurrent(0);

        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        Map<String, String> map = new LinkedHashMap<String, String>();
        data.setMsg(map);
        map.put("keyOne", "123");

        list.add(map);
        data.setMsg(list);


        responseMsg.setServiceData(data);
        String json = objectMapper.writeValueAsString(responseMsg);
        return json;
    }
}
