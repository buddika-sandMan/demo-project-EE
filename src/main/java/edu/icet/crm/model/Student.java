package edu.icet.crm.model;

import lombok.*;

//@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private String name;
    private String email;
    private String contactNo;
}
