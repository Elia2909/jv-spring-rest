package mate.academy.spring.model.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MovieRequestDto {
    private String title;
    private String description;
}
