package dev.esophose.sparkstacker.stack.settings.entity;

import dev.esophose.sparkstacker.config.CommentedFileConfiguration;
import dev.esophose.sparkstacker.stack.StackedEntity;
import dev.esophose.sparkstacker.stack.settings.EntityStackSettings;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

public class SkeletonHorseStackSettings extends EntityStackSettings {

    public SkeletonHorseStackSettings(CommentedFileConfiguration entitySettingsFileConfiguration) {
        super(entitySettingsFileConfiguration);
    }

    @Override
    protected boolean canStackWithInternal(StackedEntity stack1, StackedEntity stack2) {
        return true;
    }

    @Override
    protected void setDefaultsInternal() {

    }

    @Override
    public EntityType getEntityType() {
        return EntityType.SKELETON_HORSE;
    }

    @Override
    public Material getSpawnEggMaterial() {
        return Material.SKELETON_HORSE_SPAWN_EGG;
    }

}