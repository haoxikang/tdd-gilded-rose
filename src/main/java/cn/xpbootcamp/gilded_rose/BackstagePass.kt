package cn.xpbootcamp.gilded_rose

open class BackstagePass : Goods("BackstagePass", 30, 20) {
    override fun changeQualityByDay() {
        if (sellIn == 0) {
            quality = 0
            return
        }
        when {
            sellIn > 10 -> {
                quality += 1
            }
            sellIn in 5..10 -> {
                quality += 2
            }
            sellIn < 5 -> {
                quality += 3
            }
        }
        if (quality > 50) quality = 50
    }

}