package com.aloyolaa.videogamebackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pattern_info")
public class PatternInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "image")
    private String image;

    @Column(name = "explication")
    private String explication;

    @Column(name = "type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "pattern_id")
    private Pattern pattern;
}