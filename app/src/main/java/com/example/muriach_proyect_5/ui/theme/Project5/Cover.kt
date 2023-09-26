package com.example.muriach_proyect_5.ui.theme.Project5

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.muriach_proyect_5.R

/*
In 'Cover' has the menu for choose the exercises, Exercise 1 to Exercise 4.1
*/

@Composable
fun Cover(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.android),
                contentDescription = "",
                modifier = Modifier.size(200.dp)
                    .padding(bottom = 30.dp)
                    .fillMaxWidth(),
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {

            Text(
                text = "Exercises Project 5",
                fontSize = 40.sp,
                modifier = Modifier.padding(20.dp)
            )

            Spacer(modifier = Modifier.size(30.dp))
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise1") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 1")
            }

            Button(
                onClick = { navController.navigate("Exercise2") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 2")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise3") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 3")
            }

            Button(
                onClick = { navController.navigate("Exercise4") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 4")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise4_1") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

            ) {
                Text(text = "Exercise 4.1")
            }
        }
    }
}