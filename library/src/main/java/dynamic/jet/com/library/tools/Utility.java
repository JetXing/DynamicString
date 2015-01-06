package dynamic.jet.com.library.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by xingguangyao on 15/1/5.
 */
public class Utility {

    /**
     * 防止实例化，无意义
     */
    private Utility(){
        super();
    }

    /**
     * log TAG
     * @param mClass
     * @return
     */
    public static String getTAG(Class mClass){
        return mClass.getName();
    }

    /**
     * 简化创建HashMap
     * @param <K>
     * @param <V>
     * @return HashMap
     */
    public static <K, V> HashMap<K, V> mapNewInstance(){

        return new HashMap<K, V>();
    }

    /**
     * 简化创建List
     * @param <E>
     * @return
     */
    public static <E> List<E> listNewInstance(){
        return new ArrayList<E>();
    }
}
