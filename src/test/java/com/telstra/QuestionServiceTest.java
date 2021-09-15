package com.telstra;

import com.telstra.dto.QuestionResponse;
import com.telstra.model.Question;

import com.telstra.repository.QuestionRepository;

import com.telstra.service.QuestionService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

// Enable this when testing code in the IDE
//import org.junit.Test;

// Enable this when you require code coverage in SonarQube
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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


}
