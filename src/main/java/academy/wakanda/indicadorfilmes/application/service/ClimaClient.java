package academy.wakanda.indicadorfilmes.application.service;

import academy.wakanda.indicadorfilmes.application.api.ClimaDTO;
import academy.wakanda.indicadorfilmes.application.api.LocalizacaoDTO;

public interface ClimaClient {

    ClimaDTO buscaClima(LocalizacaoDTO localizacao);
}
