package com.myTask.task.service.impl;

import com.myTask.task.model.StoryCard;
import com.myTask.task.repository.StoryRepository;
import com.myTask.task.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoryServiceImpl implements StoryService {

    @Autowired
    private StoryRepository storyRepository;
    @Override
    public List<StoryCard> findAll() {
        return storyRepository.findAll();
    }

    @Override
    public StoryCard saveOrUpdateStudent(StoryCard storyCard) {
        return storyRepository.save(storyCard);
    }

    @Override
    public List<StoryCard> findAllByOrderByEpicNumber() {
        return storyRepository.findAllByOrderByEpicNumber();
    }


}
