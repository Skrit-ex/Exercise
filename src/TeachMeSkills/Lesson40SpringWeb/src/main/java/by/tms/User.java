package by.tms;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotBlank
    @NotEmpty
    private String name;
    @NotBlank
    @NotEmpty
    private String username;
    @NotBlank
    @NotEmpty
    private String password;
}
