package academy.wakanda.indicadorfilmes.infra;

import academy.wakanda.indicadorfilmes.application.api.ClimaDTO;
import academy.wakanda.indicadorfilmes.application.api.LocalizacaoDTO;
import academy.wakanda.indicadorfilmes.application.service.ClimaClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class ClimaInfraClient implements ClimaClient {

	private final ClimaFeignClient climaFeignClient;

	@Value("${academy.wakanda.key}")
	private String apiKey;

	@Value("${academy.wakanda.units}")
	private String units;

	@Override
	public ClimaDTO buscaClima(LocalizacaoDTO localizacao) {
		log.info("[inicia] ClimaInfraClient - buscaClima");
		log.info("[localizacao] {}", localizacao);
		ClimaDTO climaDTO = climaFeignClient.buscaClima(localizacao.getLongitude(), localizacao.getLatitude(), apiKey,
				units);
		log.info("[clima] {}", climaDTO);
		log.info("[finaliza] ClimaInfraClient - buscaClima");
		return climaDTO;
	}
}
