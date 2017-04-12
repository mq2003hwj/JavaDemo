package com.gaussic.common;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;
import java.sql.Timestamp;
public class TimestampConverter implements Converter<String, Timestamp> {

    @Override
    public Timestamp convert(String timeStr) {
        // TODO Auto-generated method stub
        Timestamp t=null;
        if(!StringUtils.isEmpty(timeStr)){
            long time=Long.valueOf(timeStr);
            t=new Timestamp(time);
        }
        return t;
    }
}