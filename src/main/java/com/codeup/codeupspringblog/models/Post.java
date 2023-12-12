package com.codeup.codeupspringblog.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Post {

    private long id;
    private String title;
    private String body;
}
