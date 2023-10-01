package fr.aimcvent.role.api;

import java.util.*;

public class RandomGenerator implements RoleGenerator {

    private final RoleService roleService;

    private RandomGenerator(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public Map<UUID, Role> generate(List<UUID> uuids) {
        final List<Class<? extends Role>> roles = new ArrayList<>();
        final Map<UUID, Role> roleMap = new HashMap<>();

        this.roleService.all().forEach(role -> {
            for (int i = 0; i < this.roleService.countOf(role); i++) {
                roles.add(role);
            }
        });

        final Random random = new Random(System.currentTimeMillis());

        while (!roles.isEmpty() && !uuids.isEmpty()) {
            final Class<? extends Role> role = roles.get(random.nextInt(roles.size()));
            final UUID uuid = uuids.get(random.nextInt(uuids.size()));

            roleMap.put(uuid, this.roleService.createOf(uuid, role));

            uuids.remove(uuid);
            roles.remove(role);
        }

        return roleMap;
    }

}
