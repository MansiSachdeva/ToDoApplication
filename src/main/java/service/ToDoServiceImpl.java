package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import repository.ToDoRepository;
import schemaobject.TaskSO;
import util.ConvertorFunctions;

public class ToDoServiceImpl implements ToDoService {
	
	@Autowired
	ToDoRepository taskRepository;

	@Override
	public List<TaskSO> findByUserName(String username) {
		return taskRepository.findAll().stream()
				.map(ConvertorFunctions::toTaskSO).collect(Collectors.toList());
	}

	@Override
	public TaskSO create(TaskSO taskSO) {
		return ConvertorFunctions.toTaskSO(taskRepository.save(ConvertorFunctions.toTaskEntity(taskSO)));
	}
	
}
