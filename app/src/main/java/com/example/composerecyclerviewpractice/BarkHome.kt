package com.example.composerecyclerviewpractice

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composerecyclerviewpractice.data.DataProvider

@Composable
fun BarkHomeContent(modifier: Modifier = Modifier){
    val puppy  =  remember { DataProvider.puppyDataList}
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)){
        items(
            items = puppy,
            itemContent = {
                PuppyListItem(puppy = it)
            })
    }
}