package com.ayming.ijss.portailijss_backend.infrastructure.adapter.persistence.jpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userId;

    @Column
    private String name;

    @Column
    private String description;
}
