package com.fulihui.prizecore.web.controller;


import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by IntelliJ IDEA.
 * User:   lizhi
 * Date: 2018-5-4
 * Time: 10:24
 *
 * @author Administrator
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class WebControllerTest {


    @Autowired
    WebApplicationContext webApplicationContext;

    MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void mock() {
        try {
            String res = mockMvc.perform(post("/delete")
                    .contentType(MediaType.APPLICATION_JSON_UTF8)
                    .content(JSON.toJSONString(new Object())))
                    .andExpect(status().isOk())
                    .andReturn().getResponse().getContentAsString();
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
