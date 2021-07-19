package util;

import org.modelmapper.ModelMapper;

import entity.TaskEntity;
import schemaobject.TaskSO;

public class ConvertorFunctions {

	
	  private static final ModelMapper modelMapper = new ModelMapper();

	    private ConvertorFunctions() {
	        // To hide the implicit one.
	    }

	    public static TaskEntity toTaskEntity(TaskSO taskDto) {
	       return modelMapper.map(taskDto, TaskEntity.class);
	    }

	    public static TaskSO toTaskSO(TaskEntity taskEntity) {
	        return modelMapper.map(taskEntity, TaskSO.class);
	    }
}
