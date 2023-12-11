package com.codeup.codeupspringblog.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ad {
    private long id;
    private String title;
    private String description;

    public Ad(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
