package br.com.mendes.apifunctionalfinance.dto;

import java.math.BigDecimal;

public record MovementDto(String description, BigDecimal value, String type, CalendarDto calendar) {
}
