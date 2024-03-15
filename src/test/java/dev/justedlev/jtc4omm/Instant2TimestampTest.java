package dev.justedlev.jtc4omm;

import dev.justedlev.jtc4omm.Instant2Timestamp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.time.Instant;

class Instant2TimestampTest {
    static Instant2Timestamp instant2Timestamp = new Instant2Timestamp();
    static ModelMapper modelMapper = new ModelMapper();
    Instant instant = Instant.now();

    @BeforeAll
    static void beforeAll() {
        modelMapper.addConverter(instant2Timestamp);
    }

    @Test
    void convert() {
        var actual = modelMapper.map(instant, Timestamp.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(instant.getEpochSecond(), actual.getTime() / 1000);
        Assertions.assertEquals(instant, actual.toInstant());
    }
}