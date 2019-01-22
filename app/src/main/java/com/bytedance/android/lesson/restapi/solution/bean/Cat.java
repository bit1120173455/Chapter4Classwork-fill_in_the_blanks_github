package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
//将json文件转成java，注意对应格式//
public class Cat {

//    public  class category{
//        public  String id;
//        public  String name;
//    }
    // TODO-C1 (1) Implement your Cat Bean here according to the response json


        @SerializedName("id") private String id;
//        @SerializedName("categories") private List<category> categories;
        @SerializedName("url") private String url;
        public String getId() {

            return id;

        }

        public void setId(String id) {

            this.id = id;

        }
        public String getUrl() {

            return url;

        }

        public void setUrl(String url) {

            this.url = url;

        }

    @Override public String toString() {

        return "{" +
                "breeds"+"[]"+
                ", categories=" +
//                    ", categories=" + categories +
                ", id=" + id +
                ", url='" + url + '\'' +
                '}';

    }






//        public List<String> getCategories() {
//
//            return categories;
//
//        }
//
//
//
//        public void setCategories(List<String> categories) {
//
//            this.categories = categories;
//
//        }

//[
//        {
//            "breeds": [],
//            "categories": [
//            {
//                "id": 2,
//                    "name": "space"
//            }
//        ],
//            "id": "3q",
//                "url": "https://cdn2.thecatapi.com/images/3q.jpg"
//        }
//]

//        @Override public String toString() {
//
//            return "{" +
//                    "breeds"+"[]"+
//                    ", categories=" +
////                    ", categories=" + categories +
//                    ", id=" + id +
//                    ", url='" + url + '\'' +
//                    '}';
//
//        }

//    }



//    @Override public String toString() {
//
//        return "Joke{" +
//
//                "type='" + type + '\'' +
//
//                ", value=" + value +
//
//                '}';
//
//    }

}
