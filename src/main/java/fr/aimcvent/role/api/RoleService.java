package fr.aimcvent.role.api;

import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.kernel.api.translation.Translation;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoleService extends Service {

    List<Class<? extends Role>> all();

    Optional<Role> of(UUID owner);

    int countOf(Class<? extends Role> clazz);

    String nameOf(Class<? extends Role> clazz, Service service, Translation translation);

    String descriptionOf(Class<? extends Role> clazz, Service service, Translation translation);

    Role createOf(UUID owner, Class<? extends Role> clazz);

    void register(Class<? extends Role> clazz, int count);

    Optional<RoleGenerator> generatorOf(Class<? extends RoleGenerator> clazz);

    void registerGenerator(Class<? extends RoleGenerator> clazz);

    void registerAttachment(Class<? extends RoleAttachment> clazz);

}
