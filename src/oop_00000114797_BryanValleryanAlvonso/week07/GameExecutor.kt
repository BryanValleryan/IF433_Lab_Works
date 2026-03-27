package oop_00000114797_BryanValleryanAlvonso.week07

fun processEvent(event: BattleState) {
        when (event) {
            is BattleState.MonsterEncounter -> {
                val (monsterName) = event
                println("Monster $monsterName muncul! Berhati-hatilah!")
            }

            is BattleState.LootDropped -> {
                val (item) = event
                println("Kamu mendapatkan ${item.name} (${item.rarity}) dengan damage ${item.damage}")
            }

            is BattleState.GameOver -> {
                val (reason) = event
                println("Game Over! Alasan: $reason")
            }

            BattleState.SafeZone -> {
                println("Kamu berada di zona aman. Istirahat sejenak.")
            }
        }
}