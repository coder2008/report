package cn.itcast.hessian;

import cn.itcast.domain.User;

public interface IweatherService {
	public String getWeatherByCityName(String name);

	public String saveUser(User user);
}
