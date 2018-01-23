
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tony on 2018/1/23.
 * PACKAGE_NAME.ShopAdministration
 * 描述：
 */
public class TestMyUrl {

    public static void main(String[] args) {
        String host = "http://192.168.2.239:3329/refactoring";
        String path = "/fundEstEntity/funds?name=&fundType=0&pageIndex=1&pageSize=10";
        String method = "GET";
        //String appcode = "你自己的AppCode";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("X-Token", "A0925ABD900A455CAFACF7A1A272AC58");
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/json; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        //String bodys = "{\"inputs\":[{\"image\":{\"dataType\":50,\"dataValue\":\"图片二进制数据的base64编码\"},\"configure\":{\"dataType\":50,\"dataValue\":\"{\\\"side\\\":\\\"face\\\"}\"#身份证正反面类型:face/back}}]}";


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            //HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(response.toString());
            //获取response的body
            JSONArray jsonArray = JSONObject.fromObject(EntityUtils.toString(response.getEntity())).getJSONObject("data").getJSONArray("resultData");
            for (Object json: jsonArray) {
                System.out.println(json);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
