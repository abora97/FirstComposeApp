package com.abora.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abora.firstcomposeapp.ui.theme.FirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//           Greeting(name = "Abora")
//            Row {
//                Text(text = "Row")
//                Text(text = "Abora")
//            }
//            Column {
//                Text(text = "Column")
//                Text(text = "Abora")
//            }


            /***
            SpaceEvenly : make spaces separated between views by half

            SpaceAround : make spaces separated between views by half but at top and bottom have height /2
             */

//            Column(
//                modifier= Modifier
//                    .fillMaxSize()
//                    .background(Color.Green),
//                horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceAround) {
//                Text(text = "Abora")
//                Text(text = "Android")
//                Text(text = "Dev")
//            }

            Row(
                modifier = Modifier
                    .width(300.dp)
                    .fillMaxHeight(0.6f) // 60% of screen height
                    .background(Color.Green),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Abora", color = Color.Blue , fontSize = 20.sp)
                Text(text = "Android")
                Text(text = "Dev")
            }


        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstComposeAppTheme {
        Greeting("Android")
    }
}