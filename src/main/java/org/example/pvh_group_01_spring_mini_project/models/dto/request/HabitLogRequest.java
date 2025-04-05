package org.example.pvh_group_01_spring_mini_project.models.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.pvh_group_01_spring_mini_project.models.entity.HabitLog;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HabitLogRequest {
    private Status status;
    private UUID habitId; // Changed from Integer to UUID

    public enum Status {
        COMPLETED,
        MISSED
    }
}