package com.kbstar.dto;

import lombok.*;
//import org.springframework.format.annotation.DateTimeFormat;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Sales {
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String rdate;
    private int price;
    private String gender;
}

