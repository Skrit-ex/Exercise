package by.tms;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @NotEmpty
    private String name;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
}
