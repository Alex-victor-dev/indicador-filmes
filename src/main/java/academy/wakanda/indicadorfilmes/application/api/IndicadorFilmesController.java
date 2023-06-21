package academy.wakanda.indicadorfilmes.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequiredArgsConstructor
public class IndicadorFilmesController implements IndicadorFilmesAPI {
    @Override
    public List<FilmeResponse> indicaFilmes(Long longitude, Long latitude) {
        log.info( "[inicia] IndicadorFilmesController - indicaFilmes" );
        log.info( "[longitude] {} - [latitude] {}", longitude, latitude );
        log.info( "[finaliza] IndicadorFilmesController - indicaFilmes" );
        return null;
    }
}
