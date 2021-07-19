package service;

import java.util.List;

import schemaobject.TaskSO;

public interface ToDoService {

	 List <TaskSO> findByUserName(String username);
	 
	 TaskSO create(TaskSO taskSO);
	 
}
