package de.ossi.schoolservice.school;

import jakarta.validation.constraints.NotNull;

public record SchoolDto(@NotNull String name) {
}
