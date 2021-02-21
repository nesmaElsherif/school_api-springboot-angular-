package com.school.controller;
import com.school.exception.BadRequestException;
import com.school.exception.TaskNotFoundException;
import com.school.model.Task;
import com.school.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("system/")
public class TaskController {
  private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // http://localhost:8888/system/tasks
    @GetMapping("tasks")
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    // http://localhost:8888/system/task?id=1
    @GetMapping("task")
    public Task getTaskById (@RequestParam Long id){
        return taskService.getTaskById(id);
    }


   /*

      post to save tasks
      http://localhost:8888/system/tasks
      body to save task
      {
    "description": "selim",
    "priority": 5
     }

    **/
    @PostMapping("tasks")
    public Task saveTask(@RequestBody Task task){
        System.out.println("*****************************" + task.toString());
        return taskService.saveTask(task);
    }



    /*
    put to update tasks
      http://localhost:8888/system/tasks?id=5  (update task)
      body
      {
    "description": "ssssssssssssssssssssss",
    "priority": 5
     }
    **/

    @PutMapping("tasks")
    public Task editTask(@RequestBody Task task,@RequestParam Long id){
        task.setId(id);
        return taskService.saveTask(task);
    }


/*
    delete to delete task from database
    http://localhost:8888/system/tasks?id=12
 */

    @DeleteMapping("tasks")
    public void removeStudent(@RequestParam Long id){
        taskService.removeTask(id);
    }

    /*
    put to update tasks
     http://localhost:8888/system/tasks/12
      body
      {
    "description": "nody",
    "priority": 1
    }
    **/

    @PutMapping("/tasks/{id}")
    public Task updateTask(@RequestBody Task task, @PathVariable("id") long id ) {
       return taskService.updateTask(task,id);
    }
}
