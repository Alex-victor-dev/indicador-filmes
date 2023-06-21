package academy.wakanda.indicadorfilmes.application.service;

import academy.wakanda.indicadorfilmes.application.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.application.api.LocalizacaoDTO;

import java.util.List;

public interface IndicadorFilmesService {

    List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao);
}
