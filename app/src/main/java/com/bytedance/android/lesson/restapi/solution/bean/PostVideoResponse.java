package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
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
