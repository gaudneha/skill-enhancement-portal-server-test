package com.telstra;

import com.telstra.dto.UserResponse;
import com.telstra.model.User;
import com.telstra.repository.UserRepository;
import com.telstra.service.Mapper;
import com.telstra.service.UserService;

//import org.junit.Test;
import org.junit.jupiter.api.Test;


import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @InjectMocks
    private UserService userService;
    @Mock
    private UserRepository userRepository;
    @Mock
    private List<UserResponse> userResponse;
    @Mock
    private Mapper mapper;
    @Mock
    private User user;

    @Test
    public void getAllUserTest(){
        User user = new User();
        List<User> users = new ArrayList<>();
        users.add(user);
        UserResponse userResponse = new UserResponse();
        List<UserResponse> userResponses = new ArrayList<>();
        Mockito.when(userRepository.findAll()).thenReturn(users);
       Mockito.when(mapper.mapUserMin(Mockito.any())).thenReturn(userResponse);
        // Mockito.doNothing().when(userResponse.add(Mockito.any()));
        userService.getAllUsers();




    }

}
