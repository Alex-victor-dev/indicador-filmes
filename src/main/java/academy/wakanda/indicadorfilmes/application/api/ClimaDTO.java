package academy.wakanda.indicadorfilmes.application.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Optional;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClimaDTO {
    @JsonProperty("main")
    private MainDTO main;

    public Double getTemperatura() {
        return Optional.ofNullable(main)
                .map(MainDTO::getTemp)
                .orElse(null);
    }

    @Getter
    @ToString
    private static class MainDTO {
        @JsonProperty("temp")
        private Double temp;
    }
}
