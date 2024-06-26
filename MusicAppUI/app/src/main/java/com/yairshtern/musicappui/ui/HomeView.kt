package com.yairshtern.musicappui.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yairshtern.musicappui.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home() {
    val categories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    val grouped = listOf("New Release", "Favorites", "Top Rated").groupBy { it[0] }
    LazyColumn {
        grouped.forEach {
            stickyHeader {
                Text(text = it.value[0], modifier = Modifier.padding(16.dp))
                LazyRow {
                    items(categories) { cat ->
                        BrowserItem(cat = cat, drawable = R.drawable.baseline_apps_24)
                    }
                }
            }
        }
    }
}