package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "blog_posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 256)
    private String title;
    @Column(nullable = false, length = 1024)
    private String body;

    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn (name = "user_id")
    private User user;

    public Post (String title, String body) {
        this.title = title;
        this.body = body;
    }
}
