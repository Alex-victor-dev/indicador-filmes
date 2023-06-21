package academy.wakanda.indicadorfilmes.application.api;

import academy.wakanda.indicadorfilmes.application.service.IndicadorFilmesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
public class IndicadorFilmesController implements IndicadorFilmesAPI {
    private final IndicadorFilmesService indicadorFilmesService;

    @Override
    public List<FilmeResponse> indicaFilmes(Long longitude, Long latitude) {
        log.info( "[inicia] IndicadorFilmesController - indicaFilmes" );
        log.info( "[longitude] {} - [latitude] {}", longitude, latitude );
        var localizacao = LocalizacaoDTO.builder()
                .longitude(longitude)
                .latitude(latitude)
                .build();
        var filmes = indicadorFilmesService.buscaIndicacoesFilmes(localizacao);
        log.info( "[finaliza] IndicadorFilmesController - indicaFilmes" );
        return filmes;
    }
}
