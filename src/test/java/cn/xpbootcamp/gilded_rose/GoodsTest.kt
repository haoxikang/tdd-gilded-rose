package cn.xpbootcamp.gilded_rose

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.internal.verification.Times

class GoodsTest {
    @Test
    fun sell_in_should_reduce_1_when_call_changeSellInByDay() {
        val goods = Goods("test", 5, 5)
        goods.changeSellInByDay()
        assertEquals(4, goods.sellIn)
    }

    @Test
    fun sell_in_always_greater_than_or_equal_to_0_when_call_changeSellInByDay() {
        val goods = Goods("test", 0, 5)
        goods.changeSellInByDay()
        assertEquals(0, goods.sellIn)
    }

    @Test
    fun quality_should_reduce_1_when_call_changeQualityByDay() {
        val goods = Goods("test", 5, 5)
        goods.changeQualityByDay()
        assertEquals(4, goods.quality)
    }

    @Test
    fun quality_should_reduce_2_when_call_changeQualityByDay_with_sell_in_equals_to_0() {
        val goods = Goods("test", 0, 5)
        goods.changeQualityByDay()
        assertEquals(3, goods.quality)
    }

    @Test
    fun quality_always_greater_than_or_equal_to_0() {
        val goods = Goods("test", 5, 0)
        goods.changeSellInByDay()
        assertEquals(0, goods.quality)
    }

    @Test
    fun changeSellInByDay_and_changeQualityByDay_should_be_called_when_call_passADay() {
        val goods = Mockito.spy(Goods("test", 5, 5))
        goods.passADay()
        Mockito.verify(goods, Times(1)).changeQualityByDay()
        Mockito.verify(goods, Times(1)).changeSellInByDay()


    }

}