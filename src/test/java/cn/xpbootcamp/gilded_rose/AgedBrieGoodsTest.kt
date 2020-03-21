package cn.xpbootcamp.gilded_rose

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AgedBrieGoodsTest {

    @Test
    fun quality_should_reduce_2_when_call_changeQualityByDay_with_sell_in_equals_to_0_after_call_changeQualityByDay() {
        val goods: Goods = object : AgedBrieGoods() {
            init {
                sellIn = 0
            }
        }
        goods.changeQualityByDay()
        assertEquals(3, goods.quality)
    }

    @Test
    fun quality_should_increase_1_when_call_changeQualityByDay_with_sell_in_greater_than_0_after_call_changeQualityByDay() {
        val goods: Goods = object : AgedBrieGoods() {
            init {
                sellIn = 1
            }
        }
        goods.changeQualityByDay()
        assertEquals(6, goods.quality)
    }

    @Test
    fun quality_should_greater_than_or_equal_to_0_after_call_changeQualityByDay() {
        val goods: Goods = object : AgedBrieGoods() {
            init {
                sellIn = 0
                quality = 1
            }
        }
        goods.changeQualityByDay()
        assertEquals(0, goods.quality)
    }

    @Test
    fun quality_should_less_than_or_equal_to_50_after_call_changeQualityByDay() {
        val goods: Goods = object : AgedBrieGoods() {
            init {
                sellIn = 1
                quality = 50
            }
        }
        goods.changeQualityByDay()
        assertEquals(50, goods.quality)
    }
}