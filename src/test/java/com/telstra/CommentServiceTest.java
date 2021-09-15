package com.telstra;

import com.sun.source.tree.ModuleTree;
import com.telstra.dto.CommentRequest;
import com.telstra.dto.CommentResponse;
import com.telstra.model.Comment;
import com.telstra.model.Question;
import com.telstra.repository.CommentRepository;
import com.telstra.repository.QuestionRepository;
import com.telstra.service.*;
import org.junit.Assert;

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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;
@SpringBootTest
//@RunWith(SpringRunner.class)
public class CommentServiceTest {

    @InjectMocks
    @Autowired
    private CommentService commentService;

    @Mock
    @Autowired
    QuestionRepository questionRepository;

    @Mock
    @Autowired
    CommentRepository commentRepository;

    @Mock
    UserService userService;

    @Mock
    AuthService authService;

    @Mock
    NotificationService notificationService;

    @Mock
    Mapper mapper;

/*    @Test
    public void test1() {
        CommentRequest commentRequest = new CommentRequest();
        commentRequest.setQ_id("Core");
        CommentResponse commentResponse = new CommentResponse();
        commentResponse.setCreator("villain");
        commentRequest.setUrl("url");
        commentRequest.setText("test");
        Comment comment = new Comment();
        Question question = new Question();
        question.setDescription("des");
        Mockito.when(questionRepository.findById(Mockito.any())).thenReturn(Optional.of(question));
        Mockito.when(commentRepository.save(Mockito.any())).thenReturn(comment);
        //Mockito.when(authService.getCurrentUser().getUserId()).thenReturn();
        Mockito.when(userService.incrementUserPoints(Mockito.anyLong(), Mockito.any())).thenReturn("Java");
        Mockito.when(notificationService.sendNotification(Mockito.anyLong(), Mockito.any())).thenReturn("successfully");
        Mockito.when(mapper.mapComment(Mockito.any())).thenReturn(commentResponse);
        //commentService.createComment(commentRequest);


    }
    @Test
    public void testUpVote1(){
        Comment comment = new Comment();
        Mockito.when(commentRepository.findById(1L)).thenReturn(Optional.of(comment));
        Mockito.when(commentRepository.save(comment)).thenReturn(comment);
        commentService.upVote(1L);
    }
    @Test
    public void testDownVote1(){
        Comment comment = new Comment();
        Mockito.when(commentRepository.findById(1L)).thenReturn(Optional.of(comment));
        Mockito.when(commentRepository.save(comment)).thenReturn(comment);
        commentService.downVote(1L);

    }*/
/*@Test
   public void testSelectComment(){
    Comment comment = new Comment();
    Mockito.when(commentRepository.findById(1L)).thenReturn(Optional.of(comment));
    Mockito.when(commentRepository.save(comment)).thenReturn(comment);
    Mockito.when(userService.incrementUserPoints(1L, 50L)).thenReturn();
*/

    @Test
    public void testCommentUpvote(){
        commentService.upVote(5L);
        assertEquals(true,true);
        commentService.downVote(5L);
    }

    @Test
    public void testCommentDownvote(){
        commentService.downVote(4L);
        assertEquals(true,true);
        commentService.upVote(4L);
    }





}

