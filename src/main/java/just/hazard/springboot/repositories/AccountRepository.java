package just.hazard.springboot.repositories;

import just.hazard.springboot.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String> {
}
