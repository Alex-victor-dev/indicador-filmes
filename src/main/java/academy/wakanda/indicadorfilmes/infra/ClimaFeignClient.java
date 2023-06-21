package academy.wakanda.indicadorfilmes.infra;

import academy.wakanda.indicadorfilmes.application.api.ClimaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "climaClient", url = "https://api.openweathermap.org/data/2.5")
public interface ClimaFeignClient {
    @GetMapping("/weather")
    ClimaDTO buscaClima(@RequestParam("lat") Long latitude,
                        @RequestParam("lon") Long longitude,
                        @RequestParam("appid") String apiKey,
                        @RequestParam("units") String units);
}

