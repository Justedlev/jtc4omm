package dev.justedlev.jtc4omm;

import dev.justedlev.jtc4omm.Timestamp2LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Timestamp2LocalDateTest {
    static Timestamp2LocalDate timestamp2LocalDate = new Timestamp2LocalDate();
    static ModelMapper modelMapper = new ModelMapper();
    Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());

    @BeforeAll
    static void beforeAll() {
        modelMapper.addConverter(timestamp2LocalDate);
    }

    @Test
    void convert() {
        var actual = modelMapper.map(timestamp, LocalDate.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(timestamp.toLocalDateTime().toLocalDate(), actual);
    }
}