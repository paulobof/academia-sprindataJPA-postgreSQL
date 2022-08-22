package br.com.paulobof.academiaspringboot.core.functions.jackson.ser;

import br.com.paulobof.academiaspringboot.infra.utils.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.io.Serial;
import java.time.LocalDate;

/**
 * @author Venilton Falvo Jr
 */
public class LocalDateSerializer extends StdSerializer<LocalDate> {

	@Serial
    private static final long serialVersionUID = -2718386750062666481L;

	public LocalDateSerializer() {
        super(LocalDate.class);
    }

    @Override
    public void serialize(final LocalDate value, final JsonGenerator generator, final SerializerProvider provider) throws IOException {
        generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_FORMATTER));
    }
}