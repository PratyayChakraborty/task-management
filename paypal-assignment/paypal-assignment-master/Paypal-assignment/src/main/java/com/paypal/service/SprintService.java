package com.paypal.service;

import java.util.List;

import com.paypal.entity.Sprint;
import com.paypal.entity.Task;
import com.paypal.entity.TaskStatus;
import com.paypal.entity.User;
import com.paypal.exception.ResourceNotFoundException;

public interface SprintService
{

	public List<Task> getAllTasksBySprintId(Integer sprintId) throws ResourceNotFoundException;

	public Sprint changeAssignee(Integer taskId, User user) throws ResourceNotFoundException;

	public Sprint changeStatus(Integer taskId, TaskStatus status) throws ResourceNotFoundException;

	public List<Sprint> getAllSprints();

	public List<Task> getAllTasks();

	public List<Task> getAllTasksByAssigneeId(Integer assigneeId) throws ResourceNotFoundException;

	public Sprint createSprint(Sprint sprint);

	public Sprint addTaskToSprint(Integer sprintId, Task task) throws ResourceNotFoundException;

}
