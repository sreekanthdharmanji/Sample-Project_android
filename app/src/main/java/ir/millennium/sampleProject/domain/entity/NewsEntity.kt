package ir.millennium.sampleProject.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NewsEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val author: String = "",
    val title: String = "",
    val description: String = "",
    val url: String = "",
    val urlToImage: String = "",
    val publishedAt: String = "",
    val content: String = ""
)
