package dev.justedlev.jtc4omm;

import dev.justedlev.jtc4omm.LocalDate2Timestamp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class LocalDate2TimestampTest {
    static LocalDate2Timestamp localDate2Timestamp = new LocalDate2Timestamp();
    static ModelMapper modelMapper = new ModelMapper();
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.MIN;

    @BeforeAll
    static void beforeAll() {
        modelMapper.addConverter(localDate2Timestamp);
    }

    @Test
    void convert() {
        var actual = modelMapper.map(localDate, Timestamp.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(LocalDateTime.of(localDate, localTime), actual.toLocalDateTime());
    }
}