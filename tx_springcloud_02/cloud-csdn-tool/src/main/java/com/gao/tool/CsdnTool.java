package com.gao.tool;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @program: tx_springcloud_02
 * @description: 工具类
 * @author: gaowz
 * @create: 2020-12-06 11:17
 **/
@Component("Request")
public class CsdnTool {

    /**
     * 获取博客列表url
     *
     * @param url
     * @return
     */
    public String doGet(String url) {
        String body = "";
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        //设置浏览器代理
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
        try {
            //响应
            HttpResponse httpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity = httpResponse.getEntity();
            body = EntityUtils.toString(httpEntity, Consts.UTF_8);
            //释放连接
            httpGet.releaseConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }
    /**
     * 提取文章地址
     * @param html
     * @return
     */
    public Elements parse(String html) {
        //解析html获取Document
        Document doc = Jsoup.parse(html);
        //获取spu
        Elements eles = doc.select("h4>a");
        return eles;
    }
}
