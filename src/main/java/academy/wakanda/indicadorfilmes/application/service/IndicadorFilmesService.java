package academy.wakanda.indicadorfilmes.application.service;

import java.util.List;

import academy.wakanda.indicadorfilmes.application.api.FilmeResponseData;
import academy.wakanda.indicadorfilmes.application.api.LocalizacaoDTO;

public interface IndicadorFilmesService {

	List<FilmeResponseData.FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao);
}
