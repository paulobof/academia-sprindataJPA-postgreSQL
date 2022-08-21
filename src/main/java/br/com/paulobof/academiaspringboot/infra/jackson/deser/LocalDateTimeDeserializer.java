package br.com.paulobof.academiaspringboot.infra.jackson.deser;

import br.com.paulobof.academiaspringboot.infra.utils.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.io.Serial;
import java.time.LocalDateTime;

/**
 * @author Venilton Falvo Jr
 */
public class LocalDateTimeDeserializer extends StdDeserializer<LocalDateTime> {

	@Serial
    private static final long serialVersionUID = -7209271947629593913L;

	public LocalDateTimeDeserializer() {
        super(LocalDateTime.class);
    }

    @Override
    public LocalDateTime deserialize(final JsonParser parser, final DeserializationContext context) throws IOException {
        return LocalDateTime.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER);
    }
}
