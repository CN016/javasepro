package com.my016.advanced;

import java.util.ArrayList;

public class ArrayList_Aggregate_Demo5_StorageMoviesMessage {
    public static void main(String[] args) {
        //定义ArrayList集合存储电影对象
        ArrayList<movie> movies = new ArrayList<>();
        movie movie1 = new movie(9.7,new date(2018,2,22),
                "《黄金兄弟》","是个人","翻斗大街","www.016.com");
        movie movie2 = new movie(9.6,new date(2011,4,11),
                "《黄金 兄 弟》","是个   人","翻斗街","016.com");
        movie movie3 = new movie(5.7,new date(2012,2,21),
                "《糖果超甜》","不是个人","大街","www.sb.com");

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        for (int i = 0; i < movies.size(); i++) {
            System.out.println("影片"+(i+1));
            System.out.println("片名："+movies.get(i).getName());
            System.out.println("上映日期："
                    +movies.get(i).getBeShowedDate().getYear()+'/'
                    +movies.get(i).getBeShowedDate().getMonth()+'/'
                    +movies.get(i).getBeShowedDate().getDay());
            System.out.println("评分："+movies.get(i).getEvaluateScore());
            System.out.println("导演："+movies.get(i).getDirector());
            System.out.println("地区："+movies.get(i).getPlaceOfOrigin());
            System.out.println("官网："+movies.get(i).getOfficialWebsite());
            System.out.println("________________________________________________________________________________");
        }
    }
}
