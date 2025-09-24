package com.tresor.manager.services;

import com.tresor.manager.models.Status;
import com.tresor.manager.models.Task;
import com.tresor.manager.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {
    private final TaskRepository taskRepository;
    public TaskServices(TaskRepository taskRepository){
     this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks(){
     return taskRepository.findAll();
    }
    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElse(null);
    }
    public Task createTask(Task task){
        return taskRepository.save(task);
    }
    public Task updateTaskStatus(Long id, Status status){
        Task task = taskRepository.findById(id).orElse(null);
        if(task != null){
            Task updated = new Task(
                    task.taskId(),
                    task.userId(),
                    task.title(),
                    task.description(),
                    status,
                    task.priority(),
                    task.category(),
                    task.comments(),
                    task.dueDate(),
                    task.createdAt()
            );
            taskRepository.save(updated);
            return updated;
        }
        return null;
    }
}
