package academy.wakanda.indicadorfilmes.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import academy.wakanda.indicadorfilmes.domain.FilmeCategoria;

public interface FilmeCategoriaInfraJpaRepository extends JpaRepository<FilmeCategoria, UUID> {

	@Query("SELECT fc FROM FilmeCategoria fc WHERE fc.temperaturaMinima <= :temperaturaMaxima AND fc.temperaturaMaxima > :temperaturaMinima")
	List<FilmeCategoria> buscarPorIntervaloDeTemperatura(Double temperaturaMinima, Double temperaturaMaxima);

	@Query("SELECT COUNT(*) FROM FilmeCategoria")
	Long contarRegistros();

}
