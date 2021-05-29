package com.example.agecalculator

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MainScreen()
        }
    }
}

@Composable
fun AppBar(){
    TopAppBar(title = { Text(text = "Age Calculator", color = Color.LightGray)}, elevation = 4.dp)

}

@Composable
fun MainScreen(){

    Scaffold(topBar = { AppBar()}) {



   Surface(color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()) {


        Column (modifier = Modifier
            .fillMaxSize()
            .padding(64.dp), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally){


            val inputValue = remember { mutableStateOf(TextFieldValue()) }
            TextField(value = inputValue.value,  onValueChange = { inputValue.value = it}, placeholder = {Text("enter year of birth")})

                Button(
                    onClick = { Log.d("tag", "Button Clicked") },
                    colors = ButtonDefaults.textButtonColors(backgroundColor = Color.Transparent),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth(),
                    //border = BorderStroke(
                        //width = 2.dp,
                        //brush = SolidColor(Color.Red))
                ) {
                    Text("Calculate Age")
                }
            }
       }
   }
}

@Composable
fun calculate(){

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}