package converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        String pattern;
        if (s.contains("/"))
            pattern = "yyyy/MM/dd";
        else
            pattern = "yyyy-MM-dd";

        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            return format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
