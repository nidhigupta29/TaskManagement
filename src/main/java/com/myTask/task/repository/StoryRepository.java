package com.myTask.task.repository;

import com.myTask.task.model.StoryCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository extends MongoRepository<StoryCard, String> {
    List<StoryCard> findAllByOrderByEpicNumber();
}
