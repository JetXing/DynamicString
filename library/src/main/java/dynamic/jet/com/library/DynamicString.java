package dynamic.jet.com.library;

import java.net.MulticastSocket;
import java.util.Map;

import dynamic.jet.com.library.tools.Utility;

/**
 * Created by xingguangyao on 15/1/6.
 */
public class DynamicString {

    private final static String FORMAT_START = "{";
    private final static String FORMAT_END = "}";

    private String format;
    private Map<String, String> map;

    private DynamicString(String format){
        this.format = format;
        this.map = Utility.mapNewInstance();
    }

    public static DynamicString newInstance(String format){
        return new DynamicString(format);
    }

    public DynamicString append(String key, String value){
        StringBuilder mBuilder = new StringBuilder(FORMAT_START);
        mBuilder.append(key);
        mBuilder.append(FORMAT_END);
        map.put(mBuilder.toString(), value);
        return this;
    }

    public String format(){
        for (Map.Entry<String, String> entry : map.entrySet()){
            format = format.replace(entry.getKey(), entry.getValue());
        }
        return format;
    }


}
