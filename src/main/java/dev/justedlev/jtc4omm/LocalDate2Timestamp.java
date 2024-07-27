package dev.justedlev.jtc4omm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link LocalDate}, {@link Timestamp}&gt;
 * and just will convert the {@link LocalDate} to the {@link Timestamp},
 * by default time is {@link LocalTime#MIN},
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 1.0
 */
public class LocalDate2Timestamp implements Converter<LocalDate, Timestamp> {
    private final LocalTime time;

    /**
     * Create new instance using the {@link LocalTime#MIN}
     */
    public LocalDate2Timestamp() {
        this(LocalTime.MIN);
    }

    public LocalDate2Timestamp(LocalTime time) {
        this.time = time;
    }

    @Override
    public Timestamp convert(MappingContext<LocalDate, Timestamp> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(current -> LocalDateTime.of(current, time))
                .map(Timestamp::valueOf)
                .orElse(null);
    }

    public static LocalDate2Timestamp of(LocalTime time) {
        return new LocalDate2Timestamp(time);
    }
}
