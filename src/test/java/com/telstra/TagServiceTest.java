package com.telstra;

import com.telstra.dto.TagDto;
import com.telstra.exceptions.EntityNotFoundException;
import com.telstra.model.Tag;
import com.telstra.repository.TagRepository;
import com.telstra.service.TagService;

//import org.junit.Test;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.MethodOrderer;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TagServiceTest {

    @InjectMocks
    private TagService tagService;

    @Mock
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
        tagService.getAll();
    }

    @Test
    public void testGetAllById(){
        Tag tag = new Tag();
        tag.setName("cpp");
        tag.setId(1L);
        Mockito.when(tagRepository.findById(1L)).thenReturn(java.util.Optional.of(tag));
        tagService.getTagById(1L);
    }

/*    @Test(expected =  EntityNotFoundException.class)
    public void testGetById(){
        Tag tag = new Tag();
        tag.setName("cpp");
        tag.setId(1L);
        Mockito.when(tagRepository.findById(1L)).thenThrow(new EntityNotFoundException("No tag found with id : " + 1L));
        tagService.getTagById(1L);
    }*/
}