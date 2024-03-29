package dev.justedlev.jtc4omm;

import dev.justedlev.jtc4omm.Timestamp2LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;

class Timestamp2LocalDateTimeTest {
    static Timestamp2LocalDateTime timestamp2LocalDateTime = new Timestamp2LocalDateTime();
    static ModelMapper modelMapper = new ModelMapper();
    Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());

    @BeforeAll
    static void beforeAll() {
        modelMapper.addConverter(timestamp2LocalDateTime);
    }

    @Test
    void convert() {
        var actual = modelMapper.map(timestamp, LocalDateTime.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(timestamp.toLocalDateTime(), actual);
    }
}