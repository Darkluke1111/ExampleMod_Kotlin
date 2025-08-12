package examplemod.examples

import necesse.inventory.item.toolItem.swordToolItem.SwordToolItem

// Extends SwordToolItem
class ExampleSwordItem : SwordToolItem(400) {
    // Weapon attack textures are loaded from resources/player/weapons/<itemStringID>
    init {
        rarity = Rarity.UNCOMMON
        attackAnimTime.setBaseValue(300) // 300 ms attack time
        attackDamage.setBaseValue(20f) // Base sword damage
            .setUpgradedValue(1f, 95f) // Upgraded tier 1 damage
        attackRange.setBaseValue(120) // 120 range
        knockback.setBaseValue(100) // 100 knockback
    }
}