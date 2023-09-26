package com.example.muriach_proyect_5.ui.theme.Project5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/*
* In this exercise we are going to see if this number has a digit or two digits
*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise4_1(navController: NavController) {
    Text(
        text = "Welcome to: 'ONE OR TWO DIGITS'",
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 20.sp
        ),
        color = Color.Green,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp),
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        var firstNumber by remember { mutableStateOf("") }

        OutlinedTextField(value = firstNumber,
            onValueChange = {firstNumber = it},
            label = {
                Text("Introduce the number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        var textOfResult by remember { mutableStateOf("") }
        Button(onClick = {

            if (firstNumber.toDouble() >= 0 && firstNumber.toDouble() < 10 ) {
                textOfResult = "The number $firstNumber has one digits"
            } else if(firstNumber.toDouble() >= 10 && firstNumber.toDouble() < 100){
                textOfResult = "The number $firstNumber has two digits"
            } else {
                textOfResult = "The number $firstNumber hasn't one or two digits"
            }
        },
            modifier = Modifier.padding(10.dp)) {

            Text(text = "Click")
        }

        Text(text = textOfResult,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp)
        )

        //This button allows to go to "Cover" (also in Exercises 2,3 and 4)
        Button(
            onClick = {navController.navigate("Cover")},
            modifier = Modifier.padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

        ) {
            Text(text = "Previous")
        }
    }
}