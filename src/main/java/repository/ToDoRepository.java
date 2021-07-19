package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import entity.TaskEntity;

public interface ToDoRepository extends MongoRepository<TaskEntity, String> {

}
