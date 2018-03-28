package com.example.abautista.cartelera.Model;

import android.content.SyncRequest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;


public class ModelMovie {

    private ArrayList<String> dates;
        List<Cinemas> cinemas;
        List<movies> movies;
        List<Schedules> schedules;
        ArrayList<Format> formats;
        List<routes> routes;

    public ArrayList<String> getDates() {
        return dates;
    }

    public void setDates(ArrayList<String> dates) {
        this.dates = dates;
    }

    public List<Cinemas> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinemas> cinemas) {
        this.cinemas = cinemas;
    }

    public List<ModelMovie.movies> getMovies() {
        return movies;
    }

    public void setMovies(List<ModelMovie.movies> movies) {
        this.movies = movies;
    }

    public List<Schedules> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedules> schedules) {
        this.schedules = schedules;
    }

    public ArrayList<Format> getFormats() {
        return formats;
    }

    public void setFormats(ArrayList<Format> formats) {
        this.formats = formats;
    }

    public List<ModelMovie.routes> getRoutes() {
        return routes;
    }

    public void setRoutes(List<ModelMovie.routes> routes) {
        this.routes = routes;
    }

    public class Cinemas{

        private   int id;
        private   int vista_id;
        private   int citi_id;
        private   String name;
        private   String lat;
        private   String lng;
        private   String phone;
        private   String address;
        private   int position;
        private   Settings settings;

        public Settings getSettings() {
            return settings;
        }

        public void setSettings(Settings settings) {
            this.settings = settings;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getVista_id() {
            return vista_id;
        }

        public void setVista_id(int vista_id) {
            this.vista_id = vista_id;
        }

        public int getCiti_id() {
            return citi_id;
        }

        public void setCiti_id(int citi_id) {
            this.citi_id = citi_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }


    }

    public class Settings {
        private boolean is_special_prices;
        private String type_food_sales;

        public boolean isIs_special_prices() {
            return is_special_prices;
        }

        public void setIs_special_prices(boolean is_special_prices) {
            this.is_special_prices = is_special_prices;
        }

        public String getType_food_sales() {
            return type_food_sales;
        }

        public void setType_food_sales(String type_food_sales) {
            this.type_food_sales = type_food_sales;
        }
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
            List<Media> media;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getRating() {
                return rating;
            }

            public void setRating(String rating) {
                this.rating = rating;
            }

            public String getLength() {
                return length;
            }

            public void setLength(String length) {
                this.length = length;
            }

            public String getSynopsis() {
                return synopsis;
            }

            public void setSynopsis(String synopsis) {
                this.synopsis = synopsis;
            }

            public String getGenre() {
                return genre;
            }

            public void setGenre(String genre) {
                this.genre = genre;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public List<String> getCategories() {
                return categories;
            }

            public void setCategories(List<String> categories) {
                this.categories = categories;
            }

            public List<Media> getMedia() {
                return media;
            }

            public void setMedia(List<Media> media) {
                this.media = media;
            }
        }

        public class  Media{
            private String type;
            private String code;
            private String resource;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getResource() {
                return resource;
            }

            public void setResource(String resource) {
                this.resource = resource;
            }
        }

        public class Schedules {
            private int movie_id;
            private int cinema_id;
            private int city_id;
            private boolean is_special_prices;
            private ArrayList<Dates> dates;

            public ArrayList<Dates> getDates() {
                return dates;
            }

            public void setDates(ArrayList<Dates> dates) {
                this.dates = dates;
            }

            public int getMovie_id() {
                return movie_id;
            }

            public void setMovie_id(int movie_id) {
                this.movie_id = movie_id;
            }

            public int getCinema_id() {
                return cinema_id;
            }

            public void setCinema_id(int cinema_id) {
                this.cinema_id = cinema_id;
            }

            public int getCity_id() {
                return city_id;
            }

            public void setCity_id(int city_id) {
                this.city_id = city_id;
            }

            public boolean isIs_special_prices() {
                return is_special_prices;
            }

            public void setIs_special_prices(boolean is_special_prices) {
                this.is_special_prices = is_special_prices;
            }


        }

        public class Dates{
            private String date;
            private ArrayList<Formats> formats; //YO LO TENIA COMO lIST


            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public ArrayList<Formats> getFormats() {
                return formats;
            }

            public void setFormats(ArrayList<Formats> formats) {
                this.formats = formats;
            }
        }
        public class Formats{
            private int format_id;
            private String vista_id;
            private String language;
            ArrayList<showtimes> showtimes; //yo lo tenia  como List

            public int getFormat_id() {
                return format_id;
            }

            public void setFormat_id(int format_id) {
                this.format_id = format_id;
            }

            public String getVista_id() {
                return vista_id;
            }

            public void setVista_id(String vista_id) {
                this.vista_id = vista_id;
            }

            public String getLanguage() {
                return language;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public ArrayList<ModelMovie.showtimes> getShowtimes() {
                return showtimes;
            }

            public void setShowtimes(ArrayList<ModelMovie.showtimes> showtimes) {
                this.showtimes = showtimes;
            }
        }
        public class showtimes {
               private String vista_id;
               private String datetime;
               private int screen;
               private ArrayList<String> settting;
               private boolean early_morning;


            public String getVista_id() {
                return vista_id;
            }

            public void setVista_id(String vista_id) {
                this.vista_id = vista_id;
            }

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public int getScreen() {
                return screen;
            }

            public void setScreen(int screen) {
                this.screen = screen;
            }

            public ArrayList<String> getSettting() {
                return settting;
            }

            public void setSettting(ArrayList<String> settting) {
                this.settting = settting;
            }

            public boolean isEarly_morning() {
                return early_morning;
            }

            public void setEarly_morning(boolean early_morning) {
                this.early_morning = early_morning;
            }
        }



        public class Format{
            private int id;
            private String name;
            private String display_name;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDisplay_name() {
                return display_name;
            }

            public void setDisplay_name(String display_name) {
                this.display_name = display_name;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }


        public class routes {
            private String code;
            private sizes sizes;


            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public ModelMovie.sizes getSizes() {
                return sizes;
            }

            public void setSizes(ModelMovie.sizes sizes) {
                this.sizes = sizes;
            }
        }
        public class sizes{
          private String large;
          private String medium;
          private String small;
          @SerializedName("x-large")
          private String xLarge;

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getxLarge() {
                return xLarge;
            }

            public void setxLarge(String xLarge) {
                this.xLarge = xLarge;
            }
        }
}
