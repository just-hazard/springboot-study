package just.hazard.springboot.runner;

import just.hazard.springboot.entity.Account;
import just.hazard.springboot.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class RedisRunner implements ApplicationRunner {

    final StringRedisTemplate redisTemplate;

    final AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ValueOperations<String, String> values = redisTemplate.opsForValue();
        values.set("eden","hazard");
        values.set("just","this");
        values.set("bae","jinseop");

        Account account = new Account();
        account.setEmail("email");
        account.setUsername("hazard");

        accountRepository.save(account);

        Optional<Account> byId = accountRepository.findById(account.getId());
        System.out.println("값 : " + byId.get().toString());

    }
}
