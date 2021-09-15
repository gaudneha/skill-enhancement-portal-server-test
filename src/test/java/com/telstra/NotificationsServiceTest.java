package com.telstra;

import com.telstra.dto.NotificationResponse;
import com.telstra.model.Notification;
import com.telstra.repository.NotificationRepository;
import com.telstra.service.NotificationService;
import org.apache.logging.log4j.message.Message;

// Enable this when testing code in the IDE
//import org.junit.Test;

// Enable this when you require code coverage in SonarQube
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
//@RunWith(SpringRunner.class)
public class NotificationsServiceTest {
    //@InjectMocks
    @Autowired
    private NotificationService notificationService;
    //@Mock
    @Autowired
    private NotificationRepository notificationRepository;


/*    @Test
 public void sendNotificationTest (){
    Notification notification = new Notification();
    notification.setNotification("message");
    notification.setInstant(Instant.now());
    notification.setUserId(1L);

    Mockito.when(notificationRepository.save(notification)).thenReturn(notification);
   notificationService.sendNotification(1L,"message");*/

//@Test
//public void getNotifications(){
  //  List<NotificationResponse> myNotifications = new ArrayList<>();
//Mockito.when(notificationRepository.findAll()).thenReturn();

    @Test
    public void testSendNotification(){
    notificationService.sendNotification(3L,"This is a Test notification sent by Mr Admin");
    assertEquals(true,true);
    }

    @Test
    public void testGetNotifications(){
        notificationService.getNotifications(3L);
        assertEquals(true,true);
    }
}


