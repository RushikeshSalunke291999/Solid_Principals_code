package OCP.Payment;

import java.util.*;
import java.util.stream.Collectors;

public class PaymentFactory {

    private final Map<String, payment> registry;

    public PaymentFactory() {
        // Discover implementations via ServiceLoader
        ServiceLoader<payment> loader = ServiceLoader.load(payment.class);
        Map<String, payment> map = new HashMap<>();
        for (payment p : loader) {
            String key = p.getClass().getSimpleName().toLowerCase(Locale.ROOT);
            map.put(key, p);
        }
        this.registry = Collections.unmodifiableMap(map);
    }

    public Optional<payment> createByName(String name) {
        if (name == null) return Optional.empty();
        return Optional.ofNullable(registry.get(name.toLowerCase(Locale.ROOT)));
    }

    public Set<String> availableMethods() {
        return registry.keySet().stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
