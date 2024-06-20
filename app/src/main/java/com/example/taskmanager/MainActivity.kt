package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CenterImage(
                        title1 = "All tasks completed",
                        title2 = "Nice work!"
                    )
                }
            }
        }
    }
}


@Composable
fun Headers(title1: String, title2: String, modifier: Modifier = Modifier){
Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
)
{
    Text (
        text = title1,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(
            top = 24.dp,
            bottom = 8.dp
        )
    )
    Text (
        text = title2,
        textAlign = TextAlign.Center,
        fontSize = 16.sp
    )
}
}



@Composable
fun CenterImage(title1: String, title2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    )
    {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
        )
        Headers(
            title1 = title1,
            title2 = title2,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        CenterImage(
            title1 = "All tasks completed",
            title2 = "Nice work!"
        )
    }
}