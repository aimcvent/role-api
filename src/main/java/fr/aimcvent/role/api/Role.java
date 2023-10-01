package fr.aimcvent.role.api;

import fr.aimcvent.handler.api.Handlers;
import fr.aimcvent.kernel.api.translation.Translation;

public interface Role {

    String id();

    String name(Translation translation);

    String description(Translation translation);

    Handlers<Role> handlers();

    <T extends RoleAttachment> T attachmentOf(Class<T> clazz);

    void addAttachment(RoleAttachment attachment);

}
