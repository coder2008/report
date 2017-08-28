package cn.itcast.hessian;

import cn.itcast.domain.User;

public class WeatherService implements IweatherService {

	@Override
	public String getWeatherByCityName(String name) {
		if (name.equals("上海")) {
			return "下冰雹";
		}
		return "下大雪";
	}

	@Override
	public String saveUser(User user) {
		System.out.println(user);
		return "成功保存用户";
	}

}
