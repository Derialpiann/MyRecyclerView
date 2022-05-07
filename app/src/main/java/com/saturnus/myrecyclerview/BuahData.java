package com.saturnus.myrecyclerview;

import java.util.ArrayList;

public class BuahData {
    private static String [] buahName = {
            "Semangka",
            "Melon",
            "Mangga",
            "Jambu biji"
    };

    private static String [] buahDetail = {
            "Rp. 6.000 per kilogram",
            "Rp. 15.000 per kilogram",
            "Rp. 25.000 per kilogram",
            "Rp. 15.000 per kilogram"
    };

    private static int[] buahImage = {
            R.drawable.semangka,
            R.drawable.melon,
            R.drawable.mangga,
            R.drawable.jambubiji

    };

    static ArrayList<Buah> getListData() {
        ArrayList<Buah> list = new ArrayList<>();
        for (int position = 0; position < buahName.length; position++) {
            Buah buah = new Buah();
            buah.setName(buahName[position]);
            buah.setDetail(buahDetail[position]);
            buah.setPhoto(buahImage[position]);
            list.add(buah);
        }
        return list;
    }
}
