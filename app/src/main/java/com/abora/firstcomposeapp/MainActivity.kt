package com.abora.firstcomposeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextDecoration
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

//            Row(
//                modifier = Modifier
//                    .width(300.dp)
//                    .fillMaxHeight(0.6f) // 60% of screen height
//                    .background(Color.Green),
//                horizontalArrangement = Arrangement.SpaceAround,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(text = "Abora", color = Color.Blue , fontSize = 20.sp)
//                Text(text = "Android")
//                Text(text = "Dev")
//            }

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Column(
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxHeight(.5f)
                        .fillMaxSize()
                        .fillMaxWidth()
//                    .width(300.dp)
//                    .requiredWidth(600.dp)
//                    .padding(top=20.dp , bottom = 30.dp)
                        .padding(10.dp)
                        .border(5.dp, Color.Yellow)
                        .padding(5.dp)
                        .border(10.dp, Color.Red, shape = CircleShape),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = "Abora", modifier = Modifier
                            .offset(20.dp, 20.dp) // like margin without push view away
                            .clickable {
                                Toast
                                    .makeText(this@MainActivity, "hello", Toast.LENGTH_LONG)
                                    .show()
                                startActivity(Intent(this@MainActivity, Main2Activity::class.java))
                            }
                    )
                    Spacer(modifier = Modifier.height(50.dp))
                    Text(text = "Android", textDecoration = TextDecoration.LineThrough)
                }

                Column(
                    modifier = Modifier
                        .fillMaxHeight(1f)
                        .fillMaxSize()
                        .fillMaxWidth()
                        .background(Color.Gray),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = "State", modifier = Modifier
                            .clickable {
                                Toast
                                    .makeText(this@MainActivity, "State", Toast.LENGTH_LONG)
                                    .show()
                                startActivity(Intent(this@MainActivity, StateActivity::class.java))
                            }
                    )

                    Text(
                        text = "Textfields, Buttons & Showing Snackbars", modifier = Modifier
                            .clickable {
                                Toast
                                    .makeText(this@MainActivity, "Textfields, Buttons & Showing Snackbars", Toast.LENGTH_LONG)
                                    .show()
                                startActivity(Intent(this@MainActivity, TextBtnSnackActivity::class.java))
                            }
                    )

                    Text(
                        text = "Lists", modifier = Modifier
                            .clickable {
                                Toast
                                    .makeText(this@MainActivity, "Lists - Android Jetpack Compose - Part 8", Toast.LENGTH_LONG)
                                    .show()
                                startActivity(Intent(this@MainActivity, ListActivity::class.java))
                            }
                    )
                }
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