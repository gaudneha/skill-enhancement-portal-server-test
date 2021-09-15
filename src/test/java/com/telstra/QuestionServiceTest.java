package com.telstra;

import com.telstra.dto.QuestionResponse;
import com.telstra.model.Question;

import com.telstra.repository.QuestionRepository;

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
public class QuestionServiceTest {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    QuestionService questionService;

    @Test
    //@Order(6)
    public void testReadAllQuestion() {
        List list = questionRepository.findAll();
        assertEquals(true, (list).size() > (0));
    }

    @Test
    //@Order(7)
    public void testFindQuestionExists() {
        Question question = questionRepository.findById(2L).get();
        assertNotNull(question.getPostName());
    }

    @Test
    public void testFindQuestionByPostName(){
        String post_name="Please check the errors in my flutter code below";
        //Question question = questionRepository.findById(5L).get();
        QuestionResponse res = questionService.getQuesById(5L);
        assertEquals(post_name,res.getPostName());
    }

    @Test
    public void testQuestionUpvote(){

        Long id=5L;
        Optional<Question> question = questionRepository.findById(id);
        int initial_vote_count = question.get().getUpVoteCount();
        question.get().setUpVoteCount(question.get().getUpVoteCount() + 1);
        questionService.upVote(id);
        assertEquals((initial_vote_count + 1 ),question.get().getUpVoteCount());
        questionService.downVote(id);

    }

    @Test
    public void testQuestionDownvote(){

        Long id=4L;
        Optional<Question> question = questionRepository.findById(id);
        int initial_vote_count = question.get().getDownVoteCount();
        question.get().setDownVoteCount(question.get().getDownVoteCount() + 1);
        questionService.downVote(id);
        assertEquals((initial_vote_count + 1 ),question.get().getDownVoteCount());
        questionService.upVote(id);

    }


}
