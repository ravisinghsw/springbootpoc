package com.ravi.springboot.repository;

import com.ravi.springboot.domain.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ravi on 11/18/2017.
 */
public interface TopicRepository extends JpaRepository<Topic,String> {
}
