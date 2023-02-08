package com.example.androidcomposeassignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcomposeassignment2.ui.theme.AndroidComposeAssignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidComposeAssignment2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        TaskCompleteImage()
                        TaskCompleteText(firstText = getString(R.string.first_text), secondText = getString(R.string.second_text))
                    }
                }
            }
        }
    }
}
@Composable
fun TaskCompleteImage(){
    Image(painter = painterResource(id = R.drawable.img), contentDescription = null)
}

@Composable
fun TaskCompleteText(firstText:String, secondText:String){
    /*
    Set the first Text composable to a Bold font weight, 24dp padding top, and 8dp padding bottom.
    Set the second Text composable to a 16sp font size.
     */
    Text(
        text = firstText,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(
            top = 24.dp,
            bottom = 8.dp
        )
    )
    Text(
        text = secondText,
        fontSize = 16.sp
    )
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidComposeAssignment2Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TaskCompleteImage()
            }
        }
    }
}