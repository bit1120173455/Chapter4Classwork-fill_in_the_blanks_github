package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
        @SerializedName("student_id")private String student_id;
        @SerializedName("user_name")private String user_name;
        @SerializedName("image_url")private String image_url;
        @SerializedName("video_url")private String video_url;

        public void setStident_id(String student_id){
            this.student_id=student_id;
        }
        public String getStudent_id() {
            return student_id;
        }
        public void setUser_name(String user_name){
            this.user_name=user_name;
        }
        public String getUser_name(){
            return user_name;
        }
    public String getIurl() {
            return image_url;
        }

    public void setIurl(String iurl) {
            this.image_url = image_url;
        }
    public String getVurl() {
            return  video_url;
        }

    public void setVurl(String vurl) {
            this.video_url = video_url;
        }
}
/*"feeds": [
        {
            "student_id": "1120172184",
            "user_name": "limiaoyu",
            "image_url": "http://10.108.10.39:8080/minidouyin/storage/image?path=1120172184/limiaoyu/1548263073150/mmexport1547292871374.webp",
            "video_url": "http://10.108.10.39:8080/minidouyin/storage/video?path=1120172184/limiaoyu/1548263073151/mmexport1547292871374.webp"
        }
*/