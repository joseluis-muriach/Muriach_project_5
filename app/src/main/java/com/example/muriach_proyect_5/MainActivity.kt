package com.example.muriach_proyect_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.muriach_proyect_5.ui.theme.Muriach_proyect_5Theme
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Surface(
                modifier = Modifier.fillMaxSize()
            ){
                Exercise1()

            }
        }
    }
}
