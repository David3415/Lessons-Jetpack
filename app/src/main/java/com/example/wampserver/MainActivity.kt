package com.example.wampserver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            Row(modifier = Modifier
                .background(color= Color.Red).fillMaxSize(0.5f),
                horizontalArrangement = Arrangement.Start
            ) {
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
                Column(modifier = Modifier
                    .background(color= Color.Yellow)
                    .fillMaxSize(0.5f),
                verticalArrangement = Arrangement.Top
                ) {
                Text(text = "Hello")
                Text(text = "Hello")
                Text(text = "Hello")
            }
            }


        }
    }
}
@Preview(showBackground = true)
@Composable
fun newText(){
    Text(text = "Hello")
}
