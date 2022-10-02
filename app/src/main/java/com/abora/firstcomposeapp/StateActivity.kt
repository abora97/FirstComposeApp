package com.abora.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.abora.firstcomposeapp.ui.theme.FirstComposeAppTheme
import kotlin.random.Random

class StateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.fillMaxSize()) {
                val color = remember {
                    mutableStateOf(Color.Yellow)
                }

                ColorBox(
                    Modifier
                        .fillMaxSize()
                        .weight(1f)
                ){
                    color.value=it
                }
                Box(
                    modifier = Modifier
                        .background(color.value)
                        .fillMaxSize()
                        .weight(1f)
                )
            }
        }
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {
    /**
    Remember the value produced by calculation. calculation will only be evaluated during the composition.
    Recomposition will always return the value produced by composition.
     */

//    val color = remember {
//        mutableStateOf(Color.Yellow)
//    }

    Box(modifier = modifier
        .background(color = Color.Red)
        .clickable {
            updateColor(Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            ))

//            color.value = Color(
//                Random.nextFloat(),
//                Random.nextFloat(),
//                Random.nextFloat(),
//                1f
//            )
        }
    )

}

