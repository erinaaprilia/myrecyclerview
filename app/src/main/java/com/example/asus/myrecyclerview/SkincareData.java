package com.example.asus.myrecyclerview;

import java.util.ArrayList;

public class SkincareData {
    public static String[][] data = new String[][]{
            {"Laneige Water Sleeping Mask", "Laneige", "https://www.laneige.com/id/id/laneige-pim-img/product/water-sleeping-mask/LN_Product-emblem_update_WSM1_v2.jpg"},
            {"Elsheskin Deep Cleansing", "Elsheskin", "https://www.elsheskin.com/wp-content/uploads/2018/07/Deep-Cleansing-Oily.png"},
            {"Cetaphil Gentle Skin Cleanser", "Cetaphil", "https://cetaphil.co.id/wp-content/uploads/2017/12/HEAD-4.ARegular-1.png"},
            {"Some By Mi Miracle Toner", "Some By Mi", "https://1.bp.blogspot.com/-ch-6P25Ql7A/XBX6I-t8KuI/AAAAAAAAA2M/lKyN0uKYi7I0F39Ek2adETQ9KXOYg6j0gCLcBGAs/s1600/Snap%2B2018-12-16%2Bat%2B14.06.27.jpg"},
            {"The Body Shop Vitamin E Toner", "The Body Shop", "http://www.pusatkosmetik.com/image/product/body-shop/large/the-body-shop-vitamin-e-hydrating-toner-bs1206.jpg"},
            {"Avoskin Perfect Hydrating Treatment Essence", "Avoskin", "https://2.bp.blogspot.com/-4lVqIJyjJEw/Wt2hYIxsPOI/AAAAAAAAFWs/BLjj6M1VgkscoLozj3rnOqW4GbbL3ldZQCLcBGAs/s1600/IMG_8428.JPG"},
            {"The Ordinary Niacinamide 10 + Zinc 1", "The Ordinary", "https://d10qoa1dy3vloz.cloudfront.net/resized/680x854/slots-img/ord/ord002_theordinary_niacinamide10_zinc1_1560x1960-41z06.jpg"},
            {"Innisfree Perfect UV Protection Cream SPF 50+/PA+++", "Innisfree", "https://skinandseoulbeauty.com/wp-content/uploads/2018/08/IFSM24Triple-4.jpg"}
    };

    public static ArrayList<Skincare> getListData(){
        Skincare skincare= null;
        ArrayList<Skincare> list = new ArrayList<>();
        for (String[] aData : data) {
            skincare = new Skincare();
            skincare.setName(aData[0]);
            skincare.setRemarks(aData[1]);
            skincare.setPhoto(aData[2]);

            list.add(skincare);
        }

        return list;
    }
}
