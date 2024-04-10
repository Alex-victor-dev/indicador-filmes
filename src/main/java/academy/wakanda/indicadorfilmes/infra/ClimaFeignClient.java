package academy.wakanda.indicadorfilmes.infra;

import academy.wakanda.indicadorfilmes.application.api.ClimaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "climaClient", url = "${indicadorfilmes.clima.server}")
public interface ClimaFeignClient {
    @GetMapping("/weather")
    ClimaDTO buscaClima(@RequestParam("lat") Double latitude,
                        @RequestParam("lon") Double longitude,
                        @RequestParam("appid") String apiKey,
                        @RequestParam("units") String units);
}

