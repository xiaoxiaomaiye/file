package com.syy.spring.cloud.weather.service;

import com.syy.spring.cloud.weather.vo.WeatherResponse;


public interface WeatherDataService {
	// 根据城市id获取天气数据
	WeatherResponse getDataByCityId(String cityId);
	
	// 根据城市获取天气数据
	WeatherResponse getDataByCityName(String cityName);
	
}
