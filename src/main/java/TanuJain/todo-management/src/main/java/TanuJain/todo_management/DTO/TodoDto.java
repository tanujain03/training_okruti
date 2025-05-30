package TanuJain.todo_management.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TodoDto {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
