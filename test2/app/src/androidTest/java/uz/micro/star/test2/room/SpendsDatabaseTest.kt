package uz.micro.star.test2.room

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*


@RunWith(AndroidJUnit4::class)
class SpendsDatabaseTest {
    private lateinit var db: SpendsDatabase

    private lateinit var dao: SpendDao

    @Before
    fun initDB() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, SpendsDatabase::class.java).build()
        dao = db.getSpendDao()
    }

    @After
    fun closeDB() {
        db.close()
    }

    @Test
    fun writeReadSpendTest() = runBlocking {
        val spend = Spend(Date(), 1480, "My test description")
        dao.addSpend(spend)

        val spends = dao.getLast20Spends()
        val spend1 = Spend(Date(), 1480, "My test description")
//        assertThat(spends.contains(spend1)).isFalse()
        assertThat(spends).contains(spend)
    }

    @Test
    fun writeReadSpendTest1() = runBlocking {
        val spend = Spend(Date(), 1480, "My test description")
        dao.addSpend(spend)

        val spends = dao.getLast20Spends()
        val spend1 = Spend(Date(), 1480, "My test description")
//        assertThat(spends.contains(spend1)).isFalse()
        assertThat(spends).contains(spend1)
    }
}