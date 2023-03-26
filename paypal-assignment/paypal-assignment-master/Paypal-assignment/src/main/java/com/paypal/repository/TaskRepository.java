package com.paypal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paypal.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>
{

}
