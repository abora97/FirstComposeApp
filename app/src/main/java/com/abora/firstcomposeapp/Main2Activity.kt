package com.abora.firstcomposeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abora.firstcomposeapp.ui.theme.FirstComposeAppTheme

class Main2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.ic_lily_simba)
            val description = "simba !!!"
            val title = "lily is my cat"
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.4f)
                    .padding(16.dp)
                    .clickable {
                        Toast
                            .makeText(this, description, Toast.LENGTH_SHORT)
                            .show()
                    }
            ) {
                ImageCard(painter = painter, contentDes = description, title = title)
            }
        }
    }
}

// Composable fun start with capital char
@Composable
fun ImageCard(
    painter: Painter,
    contentDes: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.fillMaxHeight()) {
            Image(
                painter = painter,
                contentDescription = contentDes,
                contentScale = ContentScale.Crop
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ), startY = 300f
                    )
                )
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(text = title, style = TextStyle(color = Color.White, fontSize = 16.sp))
        }

    }
}