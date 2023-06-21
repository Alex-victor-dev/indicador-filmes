package academy.wakanda.indicadorfilmes.application.api;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class LocalizacaoDTO {

    private Double latitude;
    private Double longitude;
}
