package student;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String id;
    private String name;
    private String email;
    private String password;
    private String course;

}
