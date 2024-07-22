package com.example.musicapp.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.R

@Composable
fun BrowseScreen() {

    val categories = listOf(
        "Hits", "Happy mood", "Workout", "Studying", "Running"
    )

    LazyVerticalGrid(
        columns =  GridCells.Fixed(2)) {
        items(categories) {
            cat-> BrowserItem(cat = cat, drawable = R.drawable.baseline_apps_24)
        }
    }
}
@Composable
@Preview
fun BrowseScreenPreview() {
    BrowseScreen()
}