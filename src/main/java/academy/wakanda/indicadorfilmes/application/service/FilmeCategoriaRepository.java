package academy.wakanda.indicadorfilmes.application.service;

import academy.wakanda.indicadorfilmes.domain.FilmeCategoria;

public interface FilmeCategoriaRepository {
	FilmeCategoria buscaAtravesDaTemperatura(Double temperatura);
}
