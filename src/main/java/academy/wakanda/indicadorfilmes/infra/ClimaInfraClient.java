package academy.wakanda.indicadorfilmes.infra;

import academy.wakanda.indicadorfilmes.application.api.ClimaDTO;
import academy.wakanda.indicadorfilmes.application.api.LocalizacaoDTO;
import academy.wakanda.indicadorfilmes.application.service.ClimaClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class ClimaInfraClient implements ClimaClient {
    @Override
    public ClimaDTO buscaClima(LocalizacaoDTO localizacao) {
        log.info( "[inicia] ClimaInfraClient - buscaClima");
        log.info( "[localizacao] {}", localizacao);
        log.info( "[finaliza] ClimaInfraClient - buscaClima");

        return null;
    }
}
