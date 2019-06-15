package firstAttempt.webApp.repos;

import firstAttempt.webApp.domain.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoRepo extends CrudRepository<UserInfo, Long>{
}
