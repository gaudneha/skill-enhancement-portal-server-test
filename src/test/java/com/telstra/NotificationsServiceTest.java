package com.telstra;

import com.telstra.dto.NotificationResponse;
import com.telstra.model.Notification;
import com.telstra.repository.NotificationRepository;
import com.telstra.service.NotificationService;
import org.apache.logging.log4j.message.Message;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class NotificationsServiceTest {
    @InjectMocks
    private NotificationService notificationService;
 @Mock
 private NotificationRepository notificationRepository;
 @Test
 public void sendNotificationTest (){
    Notification notification = new Notification();
    notification.setNotification("message");
    notification.setInstant(Instant.now());
    notification.setUserId(1L);

    Mockito.when(notificationRepository.save(notification)).thenReturn(notification);
   notificationService.sendNotification(1L,"message");
}
//@Test
//public void getNotifications(){
  //  List<NotificationResponse> myNotifications = new ArrayList<>();
//Mockito.when(notificationRepository.findAll()).thenReturn();


}

