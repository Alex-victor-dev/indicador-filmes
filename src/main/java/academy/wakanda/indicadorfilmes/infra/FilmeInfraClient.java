package academy.wakanda.indicadorfilmes.infra;

import java.util.List;

import org.springframework.stereotype.Component;

import academy.wakanda.indicadorfilmes.application.api.FilmeResponseData;
import academy.wakanda.indicadorfilmes.application.service.FilmeClient;
import academy.wakanda.indicadorfilmes.domain.FilmeCategoria;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@RequiredArgsConstructor
public class FilmeInfraClient implements FilmeClient {
	private final FilmeClientFeign filmeClientFeing;

	@Override
	public List<FilmeResponseData.FilmeResponse> buscaAtravesDaCategoria(FilmeCategoria categoria) {
		log.info("[start] FilmeInfraClient - buscaAtravesCategoria");
		log.info("[categoria] {}", categoria);
		FilmeResponseData filmeData = filmeClientFeing
				.buscaFilmeAtravesCategoriaId(categoria.getCategoria().getIdTheMovieDb());
		log.info("[finish] FilmeInfraClient - buscaAtravesCategoria");
		return filmeData.getResults();
	}
}