package TanuJain.todo_management.Service.ServiceImpl;

import TanuJain.todo_management.DTO.TodoDto;
import TanuJain.todo_management.Exception.ResourceNotFoundException;
import TanuJain.todo_management.Repository.TodoRepository;
import TanuJain.todo_management.Service.TodoService;
import TanuJain.todo_management.entity.Todo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class todoServiceImpl implements TodoService {

    @Autowired
     private TodoRepository todoRepository;
    @Autowired
     private ModelMapper modelMapper;
    @Override
    public TodoDto addTodo(TodoDto todoDto) {

        //convert TodoDto into Todo Jpa entity
        Todo todo=modelMapper.map(todoDto,Todo.class);

        // Todo jpa entity
        Todo savedTodo=todoRepository.save(todo);

        // convert saved Todo jpa entity object into TodoDto Object
         TodoDto savedTodoDto =modelMapper.map(savedTodo,TodoDto.class);
         return savedTodoDto;
    }

    @Override
    public TodoDto getTodo(Long id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id:" + id));

        return modelMapper.map(todo,TodoDto.class);
    }

    @Override
    public List<TodoDto> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();

        List<TodoDto> dtoList = new ArrayList<>();
        for (Todo todo : todos) {
            TodoDto dto = modelMapper.map(todo, TodoDto.class);
            dtoList.add(dto);
        }
        return dtoList;

    }

    @Override
    public TodoDto updateTodo(TodoDto todoDto, Long id) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id:" + id));

        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());
        todo.setCompleted(todoDto.isCompleted());

        Todo updatedTodo = todoRepository.save(todo);

        return modelMapper.map(updatedTodo, TodoDto.class);
    }

    @Override
    public void deleteTodo(Long id) {

        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id : " + id));

        todoRepository.deleteById(id);
    }

    @Override
    public TodoDto completeTodo(Long id) {

        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id : " + id));

        todo.setCompleted(Boolean.TRUE);

        Todo updatedTodo = todoRepository.save(todo);

        return modelMapper.map(updatedTodo, TodoDto.class);
    }

    @Override
    public TodoDto inCompleteTodo(Long id) {

        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id : " + id));

        todo.setCompleted(Boolean.FALSE);

        Todo updatedTodo = todoRepository.save(todo);

        return modelMapper.map(updatedTodo, TodoDto.class);
    }
}
