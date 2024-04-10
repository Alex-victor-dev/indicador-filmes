package academy.wakanda.indicadorfilmes.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@Configuration
public class FilmeClientConfiguration {
	private String token;

	@Bean
	RequestInterceptor feignRequestInterceptor() {
		return new RequestInterceptor() {
			@Override
			public void apply(RequestTemplate template) {
				template.header("Authorization", token);
			}
		};
	}

	@Autowired
	public void setToken(@Value("${indicadorfilmes.filme.token}") String token) {
		this.token = token;
	}
}