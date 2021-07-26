package com.myTask.task.service;

import com.myTask.task.model.StoryCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StoryService {

    List<StoryCard> findAll();

    StoryCard saveOrUpdateStudent(StoryCard storyCard);

    List<StoryCard> findAllByOrderByEpicNumber();

}
