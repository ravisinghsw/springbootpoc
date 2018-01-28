package com.ravi.springboot.controller;

import com.ravi.springboot.domain.Topic;
import com.ravi.springboot.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ravi on 11/18/2017.
 */

@RestController
@RequestMapping("/api")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topics")
    public List<Topic> topics(){
        return  topicService.listAllTopics();
    }

    @RequestMapping(value = "/topics/{id}")
    public Topic topic(@PathVariable  String id){
        return  topicService.findSingleTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics")
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void delete(@RequestBody Topic topic){
        topicService.deleteTopic(topic);
    }
}
