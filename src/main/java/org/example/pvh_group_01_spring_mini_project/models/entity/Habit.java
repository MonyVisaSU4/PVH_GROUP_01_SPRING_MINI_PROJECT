package org.example.pvh_group_01_spring_mini_project.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Habit {
    private UUID habitId;
    private String title;
    private String description;
    private String frequency;
    private Boolean isActive;
//    private UUID appUserResponse;
    private Profile appUserResponse;
    private LocalDateTime createAt;

    public Habit(UUID habitId) {
        this.habitId = habitId;
    }
}