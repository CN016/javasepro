package com.my016.map_Learn;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String , Integer> map1 = new HashMap<>();
        map1.put("iphoneX",10);
        map1.put("娃娃",31);
        map1.put("iphoneX",100);//Hap集合后面重复的键对应的元素会覆盖前面重复的整个元素!
        map1.put( "huawei",1000) ;
        map1.put("生活用品",10);
        map1.put("手表",10);
        // {huawei=1000，手表=10，生活用品=10，iphoneX=100，娃娃=31}
        System.out.println(map1);
        //2.清空集合
        //maps.clear();
        //System.out.println(maps);
        //3.判断集合是否为空，为空返回true ，反之!
        //4.根据键获取对应值: public v get(Object key)
        System.out.println(map1.get("生活用品"));
        //5.根据键删除整个元素。〔删除键会返回键的值)
        //6.判断是否包含某个键﹐包含返回true ，反之
        //7.判断是否包含某个值。
        // huawei=1000，手表=10，生活用品=10，娃娃=31}l/8.获取全部键的集合: public Set<K> KeySet()
        //获取全部值的集合
        Collection<Integer> value = map1.values();
        System.out.println(value);

        //Map 合并
        //10.集合的大小
      // System.out.println(maps.size()); /l/4
       // 11.合并其他Hap集合。(拓展)
        Map<String , Integer> map2 = new HashMap<>();
        map2.put("java1",1);
        map2.put( "java2",100);
        //Map<String , Integer> map2 = new HashMap<>();
        map2.put("java2",1);
        map2.put( "java3",100);
        map1.putAll(map2);//把
        Map<String, Integer> map = new HashMap<>(map1);
        System.out.println(map);


    }
}
