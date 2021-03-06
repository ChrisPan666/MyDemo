package com.jiecheng.zhike.mydemo.lesson.controllers;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.jiecheng.zhike.mydemo.lesson.models.Student;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 13159 on 2017/8/9.
 */

public class JsonController {
    int code;
    int total;
    Student student;
    //json解析；
    public List<Student> getjson(){
        String json = "{\"code\":0,\"data\":{\"total\":36,\"data\":[{\"id\":\"1010000001000152149\",\"loginName\":\"20161244\",\"userName\":\"山野农夫13\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152150\",\"loginName\":\"20161245\",\"userName\":\"山野农夫14\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152151\",\"loginName\":\"20161246\",\"userName\":\"山野农夫15\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152152\",\"loginName\":\"20161247\",\"userName\":\"山野农夫16\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152153\",\"loginName\":\"20161248\",\"userName\":\"山野农夫17\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152154\",\"loginName\":\"20161249\",\"userName\":\"山野农夫18\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_f_6.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152172\",\"loginName\":\"20161001\",\"userName\":\"山野农夫\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"1010000001000149446\",\"loginName\":\"小雨青青14\",\"userName\":\"小雨青青14\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"1010000001000149589\",\"loginName\":\"jlstd2\",\"userName\":\"刘君同学2\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152005\",\"loginName\":\"小雨妖妖12\",\"userName\":\"小雨妖妖\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152034\",\"loginName\":\"tst_stu4\",\"userName\":\"杨洋\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152079\",\"loginName\":\"yangyang1\",\"userName\":\"杨洋\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152087\",\"loginName\":\"stu_guo\",\"userName\":\"测试学生\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152134\",\"loginName\":\"stu_tst1\",\"userName\":\"学生1\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152135\",\"loginName\":\"stu_tst2\",\"userName\":\"学生2\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152137\",\"loginName\":\"201609061001\",\"userName\":\"山野农夫1\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"1010000001000152138\",\"loginName\":\"201609061002\",\"userName\":\"山野农夫2\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012022\",\"loginName\":\"ylst001\",\"userName\":\"学生1\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012023\",\"loginName\":\"ylst002\",\"userName\":\"学生2\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012024\",\"loginName\":\"ylst003\",\"userName\":\"学生3\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012025\",\"loginName\":\"ylst004\",\"userName\":\"学生4\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012026\",\"loginName\":\"ylst005\",\"userName\":\"学生5\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012027\",\"loginName\":\"ylst006\",\"userName\":\"学生6\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012028\",\"loginName\":\"ylst007\",\"userName\":\"学生7\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012029\",\"loginName\":\"ylst008\",\"userName\":\"学生8\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012030\",\"loginName\":\"ylst009\",\"userName\":\"学生9\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012031\",\"loginName\":\"ylst010\",\"userName\":\"学生10\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012032\",\"loginName\":\"ylst011\",\"userName\":\"学生11\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012033\",\"loginName\":\"ylst012\",\"userName\":\"学生12\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012034\",\"loginName\":\"ylst013\",\"userName\":\"学生13\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012035\",\"loginName\":\"ylst014\",\"userName\":\"学生14\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012036\",\"loginName\":\"ylst015\",\"userName\":\"学生15\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012037\",\"loginName\":\"ylst016\",\"userName\":\"学生16\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012038\",\"loginName\":\"ylst017\",\"userName\":\"学生17\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_4.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012039\",\"loginName\":\"ylst018\",\"userName\":\"学生18\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_2.png?default\",\"banStatus\":1},{\"id\":\"2090000159000012040\",\"loginName\":\"ylst019\",\"userName\":\"学生19\",\"userPhoto\":\"http://test.download.cycore.cn/edc/openapi/avatar_default_student_50_m_3.png?default\",\"banStatus\":1}]}}";
        List<Student> list = new ArrayList<Student>();
        try {
            JSONObject jsonObject = new JSONObject(json);
            if(jsonObject!=null){
               code = jsonObject.optInt("code");
                JSONObject jsonObject1 =jsonObject.getJSONObject("data");
                total = jsonObject1.optInt("total");
                JSONArray jsonArray = jsonObject1.getJSONArray("data");
                for(int i=0;i<jsonArray.length();i++){
                    JSONObject jsonObject2 = jsonArray.getJSONObject(i);
                    student = new Student();
                    student.setId(jsonObject2.optString("id"));
                    student.setLoginName(jsonObject2.optString("loginName"));
                    student.setUserName(jsonObject2.optString("userName"));
                    student.setUserPhoto(jsonObject2.optString("userPhoto"));
                    student.setBanStatus(jsonObject2.optString("banStatus"));
                    list.add(student);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }
    //通过URL获取网络资源；
    public static Bitmap getBitmap(String imgUrl) throws IOException {
        URL url = new URL(imgUrl);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setConnectTimeout(5000);
        conn.setRequestMethod("GET");
        if(conn.getResponseCode() == 200){
            InputStream inputStream = conn.getInputStream();
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            return bitmap;
        }
        return null;
    }
}
