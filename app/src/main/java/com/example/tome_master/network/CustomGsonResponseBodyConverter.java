package com.example.tome_master.network;

import android.util.Log;

import com.example.tome_master.utils.CommonUtil;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * 时间 ：2017/11/21  9:30
 * 作者 ：陈奇
 * 作用 ：
 */
public class CustomGsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final TypeAdapter<T> adapter;

    CustomGsonResponseBodyConverter(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String str = value.string();
        if (CommonUtil.isNotEmpty(str)) {
            if (str.startsWith("<!--KG_TAG_RES_START-->"))
                str = str.replace("<!--KG_TAG_RES_START-->", "");
            if (str.endsWith("<!--KG_TAG_RES_END-->"))
                str = str.replace("<!--KG_TAG_RES_END-->", "");
            if (str.contains("\\/"))
                str = str.replace("\\/", "/");
            if (str.contains("\\r\\n"))
                str = str.replace("\\r\\n", "");
//            str = removeSome(str);
            if (str.startsWith("\""))
                str = str.substring(1);
            if (str.endsWith("\""))
                str = str.substring(0, str.lastIndexOf("\"") - 1);
        }
        Reader reader = new StringReader(str);
        JsonReader jsonReader = gson.newJsonReader(reader);
        jsonReader.setLenient(true);
        try {
            return adapter.read(jsonReader);
        } finally {
            value.close();
        }
    }

    private String removeSome(String str){
        if (str.contains("[ "))
            str = str.replace("[ ", "[");
        if (str.contains("[ "))
            removeSome(str);
        if (str.contains("[]"))
            return str.replace("[]", "\"\"");
        else
            return str;
    }
}
