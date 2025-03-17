package com.ravenous.Todo_List.repository;

import com.ravenous.Todo_List.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
