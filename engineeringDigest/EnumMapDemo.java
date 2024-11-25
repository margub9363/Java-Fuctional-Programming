package engineeringDigest;

import java.util.EnumMap;

enum DAY{
    Monday, TuesDay, WednesDay, ThursDay, FriDay, SaturDay, SunDay
}
public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<DAY, String> dayObjectEnumMap = new EnumMap<>(DAY.class);
        dayObjectEnumMap.put(DAY.Monday,"Start Of The Week");
        dayObjectEnumMap.put(DAY.TuesDay,"Boooring");
        dayObjectEnumMap.put(DAY.WednesDay,"Non-Veg Food");
        dayObjectEnumMap.put(DAY.FriDay,"Movie");
        dayObjectEnumMap.put(DAY.SunDay,"Weekend");

        System.out.println(dayObjectEnumMap);
    }
}
