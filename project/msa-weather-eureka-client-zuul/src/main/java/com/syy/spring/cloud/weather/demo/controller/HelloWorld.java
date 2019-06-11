package com.syy.spring.cloud.weather.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
	@RequestMapping("/hello")
	public String sayHello() {
		return "{\n" +
				"\t\"data\":\n" +
				"\t{\n" +
				"\t\t\"yesterday\":\n" +
				"\t\t{\n" +
				"\t\t\t\"date\":\"6日星期二\",\n" +
				"\t\t\t\"high\":\"高温 21℃\",\n" +
				"\t\t\t\"fx\":\"西风\",\n" +
				"\t\t\t\"low\":\"低温 17℃\",\n" +
				"\t\t\t\"fl\":\"<![CDATA[<3级]]>\",\n" +
				"\t\t\t\"type\":\"小雨\"\n" +
				"\t\t},\n" +
				"\t\t\"city\":\"上海\",\n" +
				"\t\t\"aqi\":\"38\",\n" +
				"\t\t\"forecast\":\n" +
				"\t\t[\n" +
				"\t\t\t{\n" +
				"\t\t\t\t\"date\":\"7日星期三\",\n" +
				"\t\t\t\t\"high\":\"高温 19℃\",\n" +
				"\t\t\t\t\"fengli\":\"<![CDATA[<3级]]>\",\n" +
				"\t\t\t\t\"low\":\"低温 13℃\",\n" +
				"\t\t\t\t\"fengxiang\":\"西北风\",\n" +
				"\t\t\t\t\"type\":\"小雨\"\n" +
				"\t\t\t},\n" +
				"\t\t\t{\n" +
				"\t\t\t\t\"date\":\"8日星期四\",\n" +
				"\t\t\t\t\"high\":\"高温 15℃\",\n" +
				"\t\t\t\t\"fengli\":\"<![CDATA[3-4级]]>\",\n" +
				"\t\t\t\t\"low\":\"低温 10℃\",\n" +
				"\t\t\t\t\"fengxiang\":\"西北风\",\n" +
				"\t\t\t\t\"type\":\"小雨\"\n" +
				"\t\t\t},\n" +
				"\t\t\t{\n" +
				"\t\t\t\t\"date\":\"9日星期五\",\n" +
				"\t\t\t\t\"high\":\"高温 17℃\",\n" +
				"\t\t\t\t\"fengli\":\"<![CDATA[<3级]]>\",\n" +
				"\t\t\t\t\"low\":\"低温 12℃\",\n" +
				"\t\t\t\t\"fengxiang\":\"东风\",\n" +
				"\t\t\t\t\"type\":\"晴\"\n" +
				"\t\t\t},\n" +
				"\t\t\t{\n" +
				"\t\t\t\t\"date\":\"10日星期六\",\n" +
				"\t\t\t\t\"high\":\"高温 19℃\",\n" +
				"\t\t\t\t\"fengli\":\"<![CDATA[<3级]]>\",\n" +
				"\t\t\t\t\"low\":\"低温 14℃\",\n" +
				"\t\t\t\t\"fengxiang\":\"东南风\",\n" +
				"\t\t\t\t\"type\":\"小雨\"\n" +
				"\t\t\t},\n" +
				"\t\t\t{\n" +
				"\t\t\t\t\"date\":\"11日星期天\",\n" +
				"\t\t\t\t\"high\":\"高温 19℃\",\n" +
				"\t\t\t\t\"fengli\":\"<![CDATA[<3级]]>\",\n" +
				"\t\t\t\t\"low\":\"低温 14℃\",\n" +
				"\t\t\t\t\"fengxiang\":\"东北风\",\n" +
				"\t\t\t\t\"type\":\"小雨\"\n" +
				"\t\t\t}\n" +
				"\t\t],\n" +
				"\t\t\"ganmao\":\"天冷空气湿度大，易发生感冒，请注意适当增加衣服，加强自我防护避免感冒。\",\n" +
				"\t\t\"wendu\":\"17\"\n" +
				"\t},\n" +
				"\t\"status\":1000,\n" +
				"\t\"desc\":\"OK\"\n" +
				"}\n";
	}
}
