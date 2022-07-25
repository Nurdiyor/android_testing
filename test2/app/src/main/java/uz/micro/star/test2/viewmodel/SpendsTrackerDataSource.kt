package uz.micro.star.test2.viewmodel

import uz.micro.star.test2.room.Spend
import uz.micro.star.test2.room.SpendDao

class SpendsTrackerDataSource(
    private val db: SpendDao
) {
    suspend fun addSpend(spend: Spend) = db.addSpend(spend)

    suspend fun getLast20Spends() = db.getLast20Spends()
}
