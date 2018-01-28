package com.ravi.springboot.service;

import com.ravi.springboot.domain.Topic;
import com.ravi.springboot.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ravi on 11/18/2017.
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository ;

    private boolean add = true ;

    void init(){
        List<Topic> topics = new ArrayList<Topic>();
        topics.add(new Topic("1","java","new java version should be used"));
        topics.add(new Topic("2","spring","you must know"));
        topics.add(new Topic("3","data structure","basics should be strong"));
        topics.add(new Topic("4","algorithm","most imp part"));
        topicRepository.save(topics);

    }

    public List<Topic> listAllTopics() {

        return topicRepository.findAll();
    }


    public Topic findSingleTopic(String id) {
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);

    }

    public void deleteTopic(Topic id) {
        topicRepository.delete(id);
    }

    public void updateTopic(Topic topic) {
        topicRepository.saveAndFlush(topic);
    }
}
