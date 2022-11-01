package com.abora.firstcomposeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abora.firstcomposeapp.ui.theme.FirstComposeAppTheme

class ListTopicsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn() {
                itemsIndexed(
                    listOf("ConstraintLayout", "ListActivity","StateActivity","TextBtnSnackActivity","MyCat","SimpleAnimations","Animated Circular Progress Bar")
                ) { index, item ->
                    Text(text = item,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp)
                            .clickable {
                                openActivity(index)
                            }
                    )
                }
            }
        }
    }

    private fun openActivity(index: Int) {
        when (index) {
            0 -> {
                startActivity(
                    Intent(
                        this@ListTopicsActivity,
                        ConstraintLayoutActivity::class.java
                    )
                )
            }
            1 -> {
                startActivity(
                    Intent(
                        this@ListTopicsActivity,
                        ListActivity::class.java
                    )
                )
            }
            2 -> {
                startActivity(
                    Intent(
                        this@ListTopicsActivity,
                        StateActivity::class.java
                    )
                )
            }

            3 -> {
                startActivity(
                    Intent(
                        this@ListTopicsActivity,
                        TextBtnSnackActivity::class.java
                    )
                )
            }
            4 -> {
                startActivity(
                    Intent(
                        this@ListTopicsActivity,
                        Main2Activity::class.java
                    )
                )
            }
            5 -> {
                startActivity(
                    Intent(
                        this@ListTopicsActivity,
                        SimpleAnimationsActivity::class.java
                    )
                )
            }

            6 -> {
                startActivity(
                    Intent(
                        this@ListTopicsActivity,
                        AnimatedCircularActivity::class.java
                    )
                )
            }
        }
    }

}