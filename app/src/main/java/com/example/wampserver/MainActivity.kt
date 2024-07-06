package com.example.wampserver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults


import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            Column {
                ListItem()
                ListItem()
                ListItem()
            }

        }
    }
}

@Composable
private fun ListItem() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
         elevation =  CardDefaults.cardElevation(5.dp),

        shape = RoundedCornerShape(15.dp)

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.TopStart
        ) {
            Row(){
               Image(  painter = painterResource(id = R.drawable.i1), contentDescription = "img",
                   contentScale = ContentScale.Crop,
                   )
                Column {
                    Text(text = "!!!!!!")
                    Text(text = "!!!!!!")
                }

            }

        }
    }
}