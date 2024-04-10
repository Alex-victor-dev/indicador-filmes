package academy.wakanda.indicadorfilmes.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import academy.wakanda.indicadorfilmes.application.api.ClimaDTO;
import academy.wakanda.indicadorfilmes.application.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.application.api.LocalizacaoDTO;
import academy.wakanda.indicadorfilmes.domain.FilmeCategoria;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class IndicadorFilmesApplicationService implements IndicadorFilmesService {
	private final ClimaClient climaClient;
	private final FilmeCategoriaRepository filmeCategoriaRepository;
	// private final FilmeClient filmeClient;

	@Override
	public List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao) {
		log.info("[inicia] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
		log.info("[localizacao] {}", localizacao);
		ClimaDTO clima = climaClient.buscaClima(localizacao);
		FilmeCategoria categoria = filmeCategoriaRepository.buscaAtravesDaTemperatura(clima.getTemperatura());
		// List<FilmeResponse> filmes = filmeClient.buscaAtravesDaCategoria(categoria);
		log.info("[finaliza] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
		return null;
	}
}
