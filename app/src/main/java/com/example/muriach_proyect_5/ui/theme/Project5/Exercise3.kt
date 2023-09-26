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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/*
In this exercise firts we are going to compare two numbers, if the first is biggest, we calculate
* the multiplication and division of the numbers, if the second is the biggest, we calculate de sum
* and the substraction of the numbers
*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise3(navController: NavController) {
    Text(
        text = "Welcome to: 'COMPARE TWO NUMBERS'",
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
        var secondNumber by remember { mutableStateOf("") }
        var resultOfSum by remember { mutableStateOf("") }
        var resultOfSubtraction by remember { mutableStateOf("") }
        var resultOfMultiplication by remember { mutableStateOf("") }
        var resultOfDivision by remember { mutableStateOf("") }

        OutlinedTextField(
            value = firstNumber,
            onValueChange = { firstNumber = it },
            label = {
                Text("Introduce first number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = secondNumber,
            onValueChange = { secondNumber = it },
            label = {
                Text("Introduce second number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        var textOfResult by remember { mutableStateOf("") }
        Button(
            onClick = {
                if (firstNumber.toDouble() < secondNumber.toDouble()) {
                    resultOfSum = (firstNumber.toInt() + secondNumber.toInt()).toString()
                    resultOfSubtraction = (secondNumber.toInt() - firstNumber.toInt()).toString()
                    textOfResult = "The result of the sum is: $resultOfSum and " +
                            "the result of the substraction is: $resultOfSubtraction"

                } else if (firstNumber.toDouble() > secondNumber.toDouble()) {
                    resultOfMultiplication = (firstNumber.toInt() * secondNumber.toInt()).toString()
                    resultOfDivision = (firstNumber.toInt() / secondNumber.toInt()).toString()
                    textOfResult =
                        "The result of the multiplication is: $resultOfMultiplication and" +
                                " the result of the division is: $resultOfDivision"
                }
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Compare")
        }

        Text(
            text = textOfResult,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp
            )
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