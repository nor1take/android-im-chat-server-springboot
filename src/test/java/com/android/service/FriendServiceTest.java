package com.android.service;


import com.android.pojo.Friend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FriendServiceTest {

    @Autowired
    private FriendService friendService;

    @Test
    public void testFriendAll() {
        List<Friend> friends = friendService.selectByUid(3);
        for (Friend friend : friends) {
            System.out.println(friend);
        }
    }

}
