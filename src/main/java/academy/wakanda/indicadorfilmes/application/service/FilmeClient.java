package academy.wakanda.indicadorfilmes.application.service;

import java.util.List;

import academy.wakanda.indicadorfilmes.application.api.FilmeResponseData;
import academy.wakanda.indicadorfilmes.domain.FilmeCategoria;

public interface FilmeClient {
	List<FilmeResponseData.FilmeResponse> buscaAtravesDaCategoria(FilmeCategoria categoria);
}
