package com.vanhan_spring.cards.audit;

import org.springframework.stereotype.Component;
import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("CARDS_MS");
    }
}
