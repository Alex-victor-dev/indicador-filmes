package academy.wakanda.indicadorfilmes.application.service;

import academy.wakanda.indicadorfilmes.application.api.FilmeResponse;
import academy.wakanda.indicadorfilmes.application.api.LocalizacaoDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class IndicadorFilmesApplicationService implements IndicadorFilmesService {
    @Override
    public List<FilmeResponse> buscaIndicacoesFilmes(LocalizacaoDTO localizacao) {
        log.info( "[inicia] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        log.info( "[localizacao] {}", localizacao);
        log.info( "[finaliza] IndicadorFilmesApplicationService - buscaIndicacoesFilmes");
        return null;
    }
}
