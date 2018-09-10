package com.yunbo.gia.todo.respository;

import com.yunbo.gia.todo.model.ToDoItem;

import java.util.List;

/**
 * Created by yunBo on 2018/9/10.
 */
public interface ToDoRepository {
	
	List<ToDoItem> findAll();
	
	ToDoItem findById(Long id);
	
	Long insert(ToDoItem toDoItem);
	
	void update(ToDoItem toDoItem);
	
	void delete(ToDoItem toDoItem);
}
