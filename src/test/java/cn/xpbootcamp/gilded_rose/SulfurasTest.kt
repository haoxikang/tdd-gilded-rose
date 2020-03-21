package cn.xpbootcamp.gilded_rose

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SulfurasTest() {
    @Test
    fun the_sell_in_always_equals_to_ageless_when_call_changeSellInByDay() {
        val goods: Goods = Sulfuras()
        goods.changeSellInByDay()
        assertEquals(Goods.AGELESS, goods.sellIn)
    }

    @Test
    fun the_quality_is_fixed_when_call_changeQualityByDay() {
        val goods: Goods = Sulfuras()
        val quality = goods.quality
        goods.changeQualityByDay()
        assertEquals(quality, goods.quality)
    }
}