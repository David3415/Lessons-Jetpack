package com.example.wampserver

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults


import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                items(count = 100) {
                    Text(
                        text = "Item $it",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                }
            }
        }
    }
}

/*
@Composable
private fun ListItem() {
    var counter = remember {
        mutableStateOf(0)
    }
    var col = remember {
        mutableStateOf(Color.Yellow)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        elevation = CardDefaults.cardElevation(5.dp),

        shape = RoundedCornerShape(15.dp)

    ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = col.value)


                .pointerInput(Unit) {
                    */
/* detectDragGesturesAfterLongPress { change, dragAmount ->
                         Log.d("MyLog", "Drag Amount: $dragAmount")
                     }*//*

                    detectTapGestures {
                        Log.d("MyLog", "Drag : $it")
                        when (++counter.value) {
                            10 -> {
                                counter.value = 0
                                col.value = Color.Magenta
                            }
                        }
                    }
                }
        ) {
            Row() {
                Image(

                    painter = painterResource(id = R.drawable.i1),
                    contentDescription = "img",
                    contentScale = ContentScale.Crop,

                    )
                Column(modifier = Modifier.clickable {
                    Log.d("MyLog", "!!!!!!!!!@@@@@@@")
                }) {
                    Text(text = counter.value.toString())
                    Text(text = "!!!!!!")
                }

            }

        }
    }
}*/
