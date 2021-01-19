package kon.legendarystatsserver.model.game;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HeroesRepository extends ReadOnlyRepository<Hero, Integer> {
	Iterable<Hero> findAllBySet(Set set);
}
