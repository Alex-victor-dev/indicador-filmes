package academy.wakanda.indicadorfilmes.application.service;

import academy.wakanda.indicadorfilmes.application.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.domain.FilmeCategoria;

import java.util.List;

public interface FilmeClient {
    List<FilmeResponse> buscaAtravesDaCategoria(FilmeCategoria categoria);
}
