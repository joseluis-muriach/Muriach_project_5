package com.example.muriach_proyect_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.muriach_proyect_5.ui.theme.Muriach_proyect_5Theme
import com.example.muriach_proyect_5.ui.theme.Project5.Cover
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise1
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise2
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise3
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise4
import com.example.muriach_proyect_5.ui.theme.Project5.Exercise4_1

/*
In this windows we can see the navigation of the different screens
*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Surface(
                modifier = Modifier.fillMaxSize()
            ){
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Cover") {
                    composable("Cover") { Cover(navController) }
                    composable("Exercise1") { Exercise1(navController)}
                    composable("Exercise2") { Exercise2(navController) }
                    composable("Exercise3") { Exercise3(navController) }
                    composable("Exercise4") { Exercise4(navController) }
                    composable("Exercise4_1") { Exercise4_1(navController) }
                }
            }
        }
    }
}
