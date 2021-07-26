package com.myTask.task.controller;

import com.myTask.task.dto.StoryDTO;
import com.myTask.task.model.StoryCard;
import com.myTask.task.service.StoryService;
import com.myTask.task.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/story")
public class StoryController {

    @Autowired
    private StoryService storyService;

    @GetMapping(value = "/")
    public List<StoryDTO> getAllStory() {
        return ObjectMapperUtils.mapAll(storyService.findAll(), StoryDTO.class);

    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateStory(@RequestBody StoryDTO storyDTO) {
        storyService.saveOrUpdateStudent(ObjectMapperUtils.map(storyDTO, StoryCard.class));
        return new ResponseEntity("Story card added successfully", HttpStatus.OK);
    }

    @GetMapping(value = "/orderByEpic")
    public List<StoryDTO> findAllByOrderByEpicNumber() {
        return ObjectMapperUtils.mapAll(storyService.findAllByOrderByEpicNumber(), StoryDTO.class);
    }

}
