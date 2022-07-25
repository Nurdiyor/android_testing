package uz.micro.star.test3.viewmodel

class SpendsTrackerDataSource(
    private val db: SpendDao
) {
    suspend fun addSpend(spend: Spend) = db.addSpend(spend)

    suspend fun getLast20Spends() = db.getLast20Spends()
}