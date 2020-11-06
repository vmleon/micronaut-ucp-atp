package micronaut.ucp.atp;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {
    Document find(String name);
}
