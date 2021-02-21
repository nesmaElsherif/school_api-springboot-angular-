package com.school.service;

import com.school.exception.BadRequestException;
import com.school.exception.TaskNotFoundException;
import com.school.model.Task;
import com.school.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository=taskRepository;
    }

    public List<Task> getTasks( ){
       // Pageable pageable = PageRequest.of(0,10);
        return taskRepository.findAll();
    }
    public Task getTaskById (Long id){
        return taskRepository.findById(id).get();
    }
    public Task  updateTask(Task task, long id) {
        if (task.getDescription() == null || task.getDescription().equals("")) {
            throw new BadRequestException();
        }
       else if (taskRepository.existsById(id)) {
            Task existTask=  getTaskById(id);
            existTask.setDescription(task.getDescription());
            existTask.setPriority(task.getPriority());
          return editTask(existTask);
        }
        else{
            throw new TaskNotFoundException();
        }
    }

    public Task saveTask(Task task){
        return taskRepository.save(task);
    }
    public Task editTask(Task task){
        return taskRepository.save(task);
    }

    public void removeTask(@RequestParam Long id){
        taskRepository.deleteById(id);
    }
}
