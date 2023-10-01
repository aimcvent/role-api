package fr.aimcvent.role.api;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface RoleGenerator {

    Map<UUID, Role> generate(List<UUID> uuids);

}
