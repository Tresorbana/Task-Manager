package com.tresor.manager.controllers;
import models.Task;
import java.util.List;
public class UserController {
    private final TaskService taskService;
    public UserController(TaskService taskService){
        this.taskService = taskService;
    }
}
