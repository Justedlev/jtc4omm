package dev.justedlev.jtc4omm;

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
public class ToUpperCase implements Converter<String, String> {
    private final Locale locale;

    /**
     * Create new instance using the {@link Locale#getDefault()}
     */
    public ToUpperCase() {
        this(Locale.getDefault());
    }

    public ToUpperCase(Locale locale) {
        this.locale = locale;
    }

    @Override
    public String convert(MappingContext<String, String> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(value -> value.toUpperCase(locale))
                .orElse(null);
    }
}
