package com.example.helloworld.dto.terms;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TermsDTO {
    private int termsNo;
    private String terms;
    private String privacy;
    private String location;
    private String finance;
    private String tax;
}
