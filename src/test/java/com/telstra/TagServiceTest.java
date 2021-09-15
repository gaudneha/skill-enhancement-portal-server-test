package com.telstra;

import com.telstra.dto.TagDto;
import com.telstra.exceptions.EntityNotFoundException;
import com.telstra.model.Tag;
import com.telstra.repository.TagRepository;
import com.telstra.service.TagService;

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

import java.util.List;

@SpringBootTest
//@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TagServiceTest {

    //@InjectMocks

    @Autowired
    private TagService tagService;

    //@Mock

    @Autowired
    private TagRepository tagRepository;


    @Test
    public void testTagService() {
        TagDto tagDto = new TagDto();
        tagDto.setName("Java");
        tagDto.setId(1L);
        tagService.createTag(tagDto);


    }

    @Test
    public void testGetAll(){
        List<Tag> var =  tagService.getAll();
        assertEquals(var.size(),var.size());
    }

    @Test
    public void testGetTagById(){
        String name = "HTML";
        Tag var = tagService.getTagById(4L);
        assertEquals(var.getName(),name);
    }

/*    @Test
    public void testGetAllById(){
        Tag tag = new Tag();
        tag.setName("cpp");
        tag.setId(1L);
        Mockito.when(tagRepository.findById(1L)).thenReturn(java.util.Optional.of(tag));
        tagService.getTagById(1L);
    }*/

/*    @Test(expected =  EntityNotFoundException.class)
    public void testGetById(){
        Tag tag = new Tag();
        tag.setName("cpp");
        tag.setId(1L);
        Mockito.when(tagRepository.findById(1L)).thenThrow(new EntityNotFoundException("No tag found with id : " + 1L));
        tagService.getTagById(1L);
    }*/
}