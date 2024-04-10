package academy.wakanda.indicadorfilmes.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class FilmeCategoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "uuid", name = "idFilme", updatable = false, unique = true, nullable = false)
	private UUID id;
	@Enumerated(EnumType.STRING)
	private FilmeCategoriaEnum categoria;
	private Double temperaturaMinima;
	private Double temperaturaMaxima;

	public FilmeCategoria(FilmeCategoriaEnum categoria, Double temperaturaMinima, Double temperaturaMaxima) {
		this.categoria = categoria;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}
}
