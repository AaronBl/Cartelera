package com.example.abautista.cartelera.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * Created by abautista on 3/27/2018.
 */

public class ModelMovie {
        List<String> date;


        public class cinemas{

        private   int id;
        private   int vista_id;
        private   int citi_id;
        private   String name;
        private   String lat;
        private   String lng;
        private   String phone;
        private   String address;
        private   int position;
        private   List<String>settings;

        }

        public class movies{
            private  int id;
            private  String name;
            private   String code;
            private String rating;
            private  String length;
            private String synopsis;
            private String genre;
            private  int position;
            private List<String> categories;
        }

        public class  media{
            private String type;
            private String code;
            private String resource;
        }

        public class schedules{
            private int movie_id;
            private int cinema_id;
            private int city_id;
            private boolean is_special_prices;
            List<dates> dates;

        }

        public class dates{
            String dates;
            List<formast> formasts;
        }
        public class formast{
            private int id;
            private String vista_id;
            private String language;
            List<showtimes> showtimes;
        }
        public class showtimes {
               private String vista_id;
               private String datetime;
               private int screen;
               private List<String> settting;
               private boolean early_morning;
        }



        public class formats{
            private int id;
            private String name;
            private String display_name;
            private String icon;
        }


        public class routes {
            private String code;
            List<sizes> sizes;
        }
        public class sizes{
          private String large;
          private String medium;
          private String small;
          @SerializedName("x-large")
          private String xLarge;

        }
}
