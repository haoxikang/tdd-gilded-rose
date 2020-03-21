package cn.xpbootcamp.gilded_rose

open class AgedBrieGoods : Goods("Aged Brie", 1000, 5) {
    override fun changeQualityByDay() {
        if (sellIn == 0) {
            quality -= 2
        } else {
            quality++
        }
        if (quality > 50) quality = 50
        if (quality < 0) quality = 0
    }
}