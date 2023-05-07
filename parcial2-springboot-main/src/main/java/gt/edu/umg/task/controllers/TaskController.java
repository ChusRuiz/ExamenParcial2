package gt.edu.umg.task.controllers;

import gt.edu.umg.task.entities.Task;
import gt.edu.umg.task.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public List<Task> findAll(){
        return taskService.findAll();
    }
    @GetMapping (value = "/{id}")
    public Task findById( Long id){
        return taskService.findById(id);
    }

    @PostMapping
    public Task createTask( Task task){
        return taskService.create(task);
    }

    @PutMapping(value = "/{id}")
    public Task modifyTask( Long id,  Task task){
        return taskService.create(task);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(Long id){
        taskService.delete(id);
    }
}
