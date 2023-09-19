package com.aloyolaa.videogamebackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "pattern_type_id")
    private PatternType patternType;

    @OneToMany
    @JoinColumn(name = "question_id", nullable = false)
    private Set<Alternative> alternatives = new LinkedHashSet<>();
}