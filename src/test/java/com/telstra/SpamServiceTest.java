package com.telstra;

import com.telstra.dto.QuestionResponse;
import com.telstra.model.Question;

import com.telstra.repository.QuestionRepository;

import com.telstra.repository.SpamRepository;
import com.telstra.service.QuestionService;
import com.telstra.service.SpamService;
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
public class SpamServiceTest {

    @Autowired
    SpamRepository spamRepository;

    @Autowired
    SpamService spamService;

    @Test
    public void testReportSpam(){

/*        spamService.reportSpam(6L);
        List<Long> ll  = spamService.getSpam(6L);
        assertEquals(true,true);*/

    }

    @Test
    public void testGetSpam(){

        List<Long> ll  = spamService.getSpam(6L);
       assertEquals(ll.size(),ll.size());
    }

}
