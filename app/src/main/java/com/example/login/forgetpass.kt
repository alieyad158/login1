package com.example.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun forgetpass(modifier: Modifier = Modifier, navcontroller: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Please Check your messages ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF52327A)
        )
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(
            value = "Your phone",
            onValueChange = {},
            label = { Text(text = "Phone") })
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick ={}, Modifier.padding(10.dp)) {
            Text(text = "Send")
        }
        Spacer(modifier = Modifier.height(10.dp))
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Resend the message")

            TextButton(onClick = {   navcontroller.navigate(Routes.Login) } ) {
                Text(text = "Go Back")


            }
        }
    }
}