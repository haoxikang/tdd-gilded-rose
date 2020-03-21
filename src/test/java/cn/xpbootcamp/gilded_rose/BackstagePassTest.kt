package cn.xpbootcamp.gilded_rose

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BackstagePassTest {
    @Test
    fun quality_should_equals_to_0_when_sell_in_equals_to_0_after_call_changeQualityByDay() {
        val goods: Goods = object : BackstagePass() {
            init {
                sellIn = 0
            }
        }
        goods.changeQualityByDay()
        assertEquals(0, goods.quality)
    }

    @Test
    fun quality_should_increase_by_1_when_sell_in_greater_than_10_after_call_changeQualityByDay() {
        val goods: Goods = object : BackstagePass() {
            init {
                sellIn = 11
            }
        }
        goods.changeQualityByDay()
        assertEquals(21, goods.quality)
    }

    @Test
    fun quality_should_increase_by_2_when_sell_between_5_and_10_after_call_changeQualityByDay() {
        val goods: Goods = object : BackstagePass() {
            init {
                sellIn = 5
            }
        }
        goods.changeQualityByDay()
        assertEquals(22, goods.quality)
    }

    @Test
    fun quality_should_increase_by_3_when_sell_less_than_5_after_call_changeQualityByDay() {
        val goods: Goods = object : BackstagePass() {
            init {
                sellIn = 4
            }
        }
        goods.changeQualityByDay()
        assertEquals(23, goods.quality)
    }

    @Test
    fun quality_should_less_than_or_equal_to_50_after_call_changeQualityByDay() {
        val goods: Goods = object : BackstagePass() {
            init {
                sellIn = 1
                quality = 50
            }
        }
        goods.changeQualityByDay()
        assertEquals(50, goods.quality)
    }
}