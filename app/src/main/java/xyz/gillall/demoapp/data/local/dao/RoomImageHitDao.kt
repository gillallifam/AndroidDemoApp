package xyz.gillall.demoapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import xyz.gillall.demoapp.data.local.model.RoomImageHit

@Dao
interface RoomImageHitDao {

    @Query("SELECT * FROM RoomImageHit ORDER BY id ASC")
    fun getAllHitss(): Flow<List<RoomImageHit>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(hit: RoomImageHit)

    @Query("DELETE FROM RoomImageHit")
    suspend fun deleteAll()
}