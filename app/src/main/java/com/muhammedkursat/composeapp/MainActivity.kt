package com.muhammedkursat.composeapp

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muhammedkursat.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
        testFunction(5,::testt2)
    }
    fun testFunction(int: Int, funtion : () -> Unit){
        funtion.invoke()
    }

    fun testt2(){
        println("Test çalışıyor.")
    }
}

@Composable
fun MainScreen(){
    Column(modifier = Modifier.fillMaxSize()
        .background(color = Color.Gray),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        CustomText(text = "Merhaba")
        CustomText(text = "dünya")
        CustomText(text = "Hello")
        CustomText(text = "world")
    }
}

@Composable
fun CustomText(text: String){
    Text(modifier = Modifier
        .background(color = Color.Green)
        .padding(top = 25.dp, bottom = 15.dp, start = 20.dp, end = 20.dp)
        .clickable {
            println("selam sana")
        }
        .width(300.dp)
        //.width(100.dp)
        //.height(100.dp)
        //.fillMaxSize(0.5f)
        ,text = text,
        fontSize = 33.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        MainScreen()
    }
