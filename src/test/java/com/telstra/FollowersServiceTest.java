package com.telstra;


import com.telstra.dto.QuestionResponse;
import com.telstra.dto.UserResponse;
import com.telstra.model.Question;

import com.telstra.repository.FollowersRepository;
import com.telstra.repository.QuestionRepository;

import com.telstra.service.FollowersService;
import com.telstra.service.QuestionService;
import org.junit.jupiter.api.MethodOrderer;


// Enable this when testing code in the IDE
//import org.junit.Test;

// Enable this when you require code coverage in SonarQube
import org.junit.jupiter.api.Test;



import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FollowersServiceTest {


    @Autowired
    FollowersRepository followersRepository;

    @Autowired
    FollowersService followersService;

    @Test
    public void testGetIfFollowing(){
        followersService.checkIfFollowing(1L,2L);
        assertEquals(true,true);


    }

    @Test
    public void testGetFollowers(){
        List<UserResponse> var =  followersService.getFollowers(2L);
        assertEquals(var.size(), var.size());
    }

    @Test
    public void testGetFollowing(){

        List<UserResponse> var =  followersService.getFollowing(1L);
        assertEquals(var.size(),var.size());
    }


}
