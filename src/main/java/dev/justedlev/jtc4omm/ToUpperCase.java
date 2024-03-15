package dev.justedlev.jtc4omm;

import lombok.RequiredArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.util.Locale;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link String}, {@link String}&gt;
 * and just will convert the {@link String} to upper case
 * using the {@link String#toUpperCase()} by default
 * the {@link Locale} can be customized if needed,
 * another case will return the null value
 *
 * @author Edward Lukashevits
 * @since 1.0
 */
@RequiredArgsConstructor
public class ToUpperCase implements Converter<String, String> {
    private final Locale locale = Locale.getDefault();

    @Override
    public String convert(MappingContext<String, String> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(value -> value.toUpperCase(locale))
                .orElse(null);
    }
}
