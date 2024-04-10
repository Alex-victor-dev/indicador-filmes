package academy.wakanda.indicadorfilmes.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/indicador-filmes")
public interface IndicadorFilmesAPI {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<FilmeResponseData.FilmeResponse> indicaFilmes(@RequestParam Double latitude, @RequestParam Double longitude);
}
