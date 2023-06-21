package academy.wakanda.indicadorfilmes.application.service;

import academy.wakanda.indicadorfilmes.application.api.ClimaDTO;
import academy.wakanda.indicadorfilmes.application.api.LocalizacaoDTO;
import org.springframework.cloud.openfeign.FeignClient;

public interface ClimaClient {

    ClimaDTO buscaClima(LocalizacaoDTO localizacao);
}
