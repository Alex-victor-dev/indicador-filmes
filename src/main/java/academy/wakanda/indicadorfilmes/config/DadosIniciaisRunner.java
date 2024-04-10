package academy.wakanda.indicadorfilmes.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import academy.wakanda.indicadorfilmes.domain.FilmeCategoria;
import academy.wakanda.indicadorfilmes.domain.FilmeCategoriaEnum;
import academy.wakanda.indicadorfilmes.infra.FilmeCategoriaInfraJpaRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DadosIniciaisRunner implements ApplicationRunner {

	private final FilmeCategoriaInfraJpaRepository filmeCategoriaRepository;

	@Override
	public void run(ApplicationArguments args) {
		Long quantidadeRegistros = filmeCategoriaRepository.contarRegistros();
		if (quantidadeRegistros == 0) {
			filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.ACAO, 40.1, Double.MAX_VALUE));
			filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.COMEDIA, 36.0, 40.0));
			filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.ANIMACAO, 20.0, 35.0));
			filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.SUSPENSE, 0.0, 20.0));
			filmeCategoriaRepository.save(new FilmeCategoria(FilmeCategoriaEnum.DOCUMENTARIO, Double.MIN_VALUE, -1.0));
		}
	}
}