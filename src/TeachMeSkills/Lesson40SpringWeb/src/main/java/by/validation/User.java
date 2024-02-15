package by.validation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotBlank(message = "Not Blank")
    @NotEmpty(message = "Not Empty")
    private String name;
    @NotBlank(message = "Not Blank")
    @NotEmpty(message = "Not Empty")
    private String username;
    @NotBlank(message = "Not Blank")
    @NotEmpty(message = "Not Empty")
    private String password;
}
