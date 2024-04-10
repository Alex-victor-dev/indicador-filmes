package academy.wakanda.indicadorfilmes.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import academy.wakanda.indicadorfilmes.application.service.FilmeCategoriaRepository;
import academy.wakanda.indicadorfilmes.domain.FilmeCategoria;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Repository
@RequiredArgsConstructor
public class FilmeCategoriaInfraRepository implements FilmeCategoriaRepository {

	private final FilmeCategoriaInfraJpaRepository filmeCategoriaInfraJpaRepository;

	@Override
	public FilmeCategoria buscaAtravesDaTemperatura(Double temperatura) {
		log.info("[Inicia] FilmeCategoriaInfraRepository - buscaAtravesDaTemperatura");
		List<FilmeCategoria> filmeCategoria = filmeCategoriaInfraJpaRepository
				.buscarPorIntervaloDeTemperatura(temperatura, temperatura);
		log.info("[finaliza] FilmeCategoriaInfraRepository - buscaAtravesDaTemperatura");
		return filmeCategoria.stream()
				.findFirst().orElseThrow(()-> new RuntimeException());
	}

}
