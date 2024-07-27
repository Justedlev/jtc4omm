package dev.justedlev.jtc4omm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link Instant}, {@link LocalDateTime}&gt;
 * and just will convert the {@link Instant}
 * to the {@link LocalDateTime} using the {@link LocalDateTime#ofInstant(Instant, ZoneId)} method
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 1.0
 */
public class Instant2LocalDateTime implements Converter<Instant, LocalDateTime> {
    private final ZoneId zoneId;

    /**
     * Create new instance using the {@link ZoneId#systemDefault()}
     */
    public Instant2LocalDateTime() {
        this(ZoneId.systemDefault());
    }

    public Instant2LocalDateTime(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    @Override
    public LocalDateTime convert(MappingContext<Instant, LocalDateTime> mappingContext) {
        return Optional.of(mappingContext)
                .map(MappingContext::getSource)
                .map(instant -> LocalDateTime.ofInstant(instant, zoneId))
                .orElse(null);
    }

    public static Instant2LocalDateTime of(ZoneId zoneId) {
        return new Instant2LocalDateTime(zoneId);
    }
}
