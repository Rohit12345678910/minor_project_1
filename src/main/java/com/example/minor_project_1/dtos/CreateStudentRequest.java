package com.example.minor_project_1.dtos;

import com.example.minor_project_1.domain.Student;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateStudentRequest {
    @NotBlank
    private String name;
    private int age;
    @NotBlank
    private String email;

    public Student toStudent()
    {
        return Student.builder()
                .name(this.name)
                .age(this.age)
                .email(this.email)
                .build();
    }
}
