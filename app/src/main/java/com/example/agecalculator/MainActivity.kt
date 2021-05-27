package com.example.agecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.agecalculator.ui.theme.AgeCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(){

    Surface(color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()) {

        Column {

            val mytext = remember { mutableStateOf(TextFieldValue()) }
            TextField(value = mytext.value,  onValueChange = { mytext.value}, label = {Text("enter year of birth")})

            Surface(color = Color.LightGray, modifier = Modifier.wrapContentSize()) {
                Button(
                    onClick = { /*TODO*/ },
                    shape = MaterialTheme.shapes.medium,
                    border = BorderStroke(width = 4.dp, brush = SolidColor(Color.Red))
                ) {
                    Text("Calculate Age")

                }
            }
        }
    }    
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}