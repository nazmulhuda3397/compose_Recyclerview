package com.example.composerecyclerviewpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composerecyclerviewpractice.ui.theme.ComposeRecyclerViewPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRecyclerViewPracticeTheme {
                // A surface container using the 'background' color from the theme
                BarkHomeContent(
                    modifier = Modifier
                        .padding(16.dp) // Set your desired padding here
                        .fillMaxSize()
                )
            }
        }
    }
}

