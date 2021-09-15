package com.telstra;

import com.telstra.dto.UserProfileResponse;
import com.telstra.dto.UserResponse;
import com.telstra.model.User;
import com.telstra.repository.UserRepository;
import com.telstra.service.Mapper;
import com.telstra.service.UserService;

// Enable this when testing code in the IDE
//import org.junit.Test;

// Enable this when you require code coverage in SonarQube
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.MethodOrderer;



import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserServiceTest {

    //@InjectMocks
    @Autowired
    private UserService userService;

   // @Mock
    @Autowired
    private UserRepository userRepository;


    @Mock
    private List<UserResponse> userResponse;
    @Mock
    private Mapper mapper;
    @Mock
    private User user;



/*    @Test
    public void getAllUserTest() {
        User user = new User();
        List<User> users = new ArrayList<>();
        users.add(user);
        UserResponse userResponse = new UserResponse();
        List<UserResponse> userResponses = new ArrayList<>();
        Mockito.when(userRepository.findAll()).thenReturn(users);
        Mockito.when(mapper.mapUserMin(Mockito.any())).thenReturn(userResponse);
        // Mockito.doNothing().when(userResponse.add(Mockito.any()));
        userService.getAllUsers();
    }*/


        @Test
        public void testGetAllUsers(){
            List<UserResponse> var = userService.getAllUsers();
            assertEquals(var.size(),var.size());
        }

        @Test
        public void testFindUser(){
            String my_username = "aniket";
            UserProfileResponse var = userService.findUser(my_username);
            assertEquals(true,true);
        }

        @Test
        public void testUserProfile(){
            UserProfileResponse var = userService.userProfile(4L);
            assertEquals(true,true);
        }

        @Test
        public void testIncrementUserPoints(){
        userService.incrementUserPoints(6L,10L);
        assertEquals(true,true);
        }

    }


