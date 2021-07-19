package api;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import schemaobject.TaskSO;
import service.ToDoService;

import org.springframework.http.MediaType;

@RestController
@RequestMapping( value = "/api/v1" )
public class ToDoController implements ToDoApi{


	@Autowired
	private ToDoService taskService;

	@GetMapping( path = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TaskSO>> findByUsername() {
		return new ResponseEntity<>(taskService.findByUserName("zzz"), HttpStatus.OK);
	}

	@PostMapping( path = "/tasks", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TaskSO> create(@Valid @RequestBody TaskSO taskSO) {
		return new ResponseEntity<>(taskService.create(taskSO), HttpStatus.CREATED);
	}
}