package com.android.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostServiceTest {
    @Autowired
    private PostService postService;

    @Test
    public void testLimitTop3(){
        postService.selectLimitNum(5,10);
    }

}
