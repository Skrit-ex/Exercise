package by.validation;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class LoginDto {

    @NotEmpty
    @NotBlank
    private String name;
    @NotEmpty
    @NotBlank
    private String password;
}
