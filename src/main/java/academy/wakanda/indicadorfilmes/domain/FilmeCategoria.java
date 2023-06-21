package academy.wakanda.indicadorfilmes.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class FilmeCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "uuid" , name = "idFilme" , updatable = false , unique = true , nullable = false)
    private UUID id;
    @Enumerated(EnumType.STRING)
    private FilmeCategoriaEnun categoria;
    private Double temperaturaMinima;
    private Double temperaturaMaxima;
}
