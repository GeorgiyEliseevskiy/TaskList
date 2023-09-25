package com.example.tasklist.web.dto.mappers;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> taskList);

    Task toEntity(TaskDto dto);
}
