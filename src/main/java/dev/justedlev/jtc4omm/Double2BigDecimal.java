package dev.justedlev.jtc4omm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link Double}, {@link BigDecimal}&gt;
 * and just will convert the {@link Double} to the {@link BigDecimal}
 * using the {@link BigDecimal#valueOf(double)}
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 1.0
 */
public class Double2BigDecimal implements Converter<Double, BigDecimal> {
    @Override
    public BigDecimal convert(MappingContext<Double, BigDecimal> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(BigDecimal::valueOf)
                .orElse(null);
    }
}
