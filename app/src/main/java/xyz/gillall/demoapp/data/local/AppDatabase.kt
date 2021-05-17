package xyz.gillall.demoapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import xyz.gillall.demoapp.data.local.dao.RoomImageHitDao
import xyz.gillall.demoapp.data.local.model.RoomImageHit

// Annotates class to be a Room Database withphabetizedWord a table (entity) of the Word class
@Database(entities = [RoomImageHit::class], version = 1, exportSchema = false)
public abstract class AppDatabase : RoomDatabase() {

    abstract fun roomImageHitDao(): RoomImageHitDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}