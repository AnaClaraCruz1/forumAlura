package alura.demo.service;

import alura.demo.model.Topic;
import alura.demo.repository.TopicRepository;
import alura.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic createTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public ResponseEntity<Topic> getTopicById(Long id) {
        Topic topic = topicRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found for this id :: " + id));
        return ResponseEntity.ok().body(topic);
    }

    public ResponseEntity<Topic> updateTopic(Long id, Topic topicDetails) {
        Topic topic = topicRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found for this id :: " + id));

        topic.setTitle(topicDetails.getTitle());
        topic.setContent(topicDetails.getContent());
        final Topic updatedTopic = topicRepository.save(topic);
        return ResponseEntity.ok(updatedTopic);
    }

    public ResponseEntity<Void> deleteTopic(Long id) {
        Topic topic = topicRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found for this id :: " + id));

        topicRepository.delete(topic);
        return ResponseEntity.noContent().build();
    }
}
