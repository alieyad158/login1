package com.example.login

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginP1(modifier: Modifier = Modifier, navcontroller: NavController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {



        Image(painter = painterResource(id = R.drawable._783954), contentDescription = "login image" ,   modifier = Modifier.size(200.dp)
        )

        Text(text = "Welcome All ", fontSize = 30.sp, fontWeight = FontWeight.Bold ,  color = Color(0xFF52327A))

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = " ",onValueChange = {} , label = { Text(text = "Your Email")})

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = " ",onValueChange = {} , label = { Text(text = "Your Password")})
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {  }) {
            Text(text = "Login") }

            Spacer(modifier = Modifier.height(6.dp))//there 'arrangement.spaceBy(vlaue.dp)' tjis way help you on never repet each line elemnet spacer .

            TextButton(onClick = { navcontroller.navigate(Routes.Forget) }) {
                Text(text = "Forget Password ?")

            }
        TextDirection
        Spacer(modifier = Modifier.height(10.dp))
         Text(text = "Or Sign in By :")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(45.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {

            // Spacer(modifier = Modifier.height(10.dp))
            Image(painter = painterResource(id = R.drawable.google_png19635), contentDescription = "facebook", modifier = Modifier
                .size(45.dp)
                .clickable {})
            Image(painter = painterResource(id = R.drawable.facebook_logo_2023), contentDescription = "facebook", modifier = Modifier
                .size(36.dp)
                .clickable {})
            Image(painter = painterResource(id = R.drawable.apple_logo_transparent), contentDescription = "facebook", modifier = Modifier
                .size(45.dp)
                .clickable {})
        }


    }

}