package cn.xpbootcamp.gilded_rose

open class Goods(val name: String, sellIn: Int, quality: Int) {

    var sellIn: Int = sellIn
        protected set

    var quality: Int = quality
        protected set

    companion object {
        const val GOODS_MAX_QUALITY = 50
        const val GOODS_MIN_QUALITY = 0
        const val AGELESS = -1
    }


    open fun passADay() {
        changeSellInByDay()
        changeQualityByDay()
    }

    open fun changeQualityByDay() {
        if (sellIn == 0) {
            quality -= 2
        } else {
            quality--
        }

        if (quality < GOODS_MIN_QUALITY) {
            quality = 0
        }
    }

    open fun changeSellInByDay() {
        sellIn--
        if (sellIn < 0) {
            sellIn = 0
        }
    }


}