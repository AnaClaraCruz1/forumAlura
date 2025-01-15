package alura.demo.mapper;

import alura.demo.dto.TopicDTO;
import alura.demo.model.Topic;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TopicMapper {
    TopicMapper INSTANCE = Mappers.getMapper(TopicMapper.class);

    TopicDTO topicToTopicDTO(Topic topic);
    Topic topicDTOToTopic(TopicDTO topicDTO);
}
