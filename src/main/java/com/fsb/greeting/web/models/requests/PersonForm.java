package com.fsb.greeting.web.models.requests;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonForm {
   // @NotBlank(message="Nom obligatoir")
    @NotBlank
    private String name;
    @NotNull
    @Min(2)
    @Max(100)
    private short age;
    private String photo;  
}