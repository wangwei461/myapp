package com.ww.myapp.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ww.myapp.entity.rs.ResponseMsg;
import org.junit.Test;

public class JsonWrapperTest {

    @Test
    public void testEntity2json() throws JsonProcessingException {
        ResponseMsg msg = new ResponseMsg();
        msg.setServiceCode("122");

        System.out.println(JsonWrapper.entity2Json(msg));
    }
}
