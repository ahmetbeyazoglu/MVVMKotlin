package com.herpestes.mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.herpestes.mvvm.ui.theme.MVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {
    val tfSayi1 = remember { mutableStateOf("") }
    val tfSayi2 = remember { mutableStateOf("") }
    val sonuc = remember { mutableStateOf("0") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = sonuc.value, fontSize = 50.sp)
        TextField(
            value = tfSayi1.value,
            onValueChange = { tfSayi1.value = it },
            label = { Text(text = "Sayı 1")}
        )
        TextField(
            value = tfSayi2.value,
            onValueChange = { tfSayi2.value = it },
            label = { Text(text = "Sayı 2")}
        )
        Button(onClick = { 
            
        }) {
            Text(text = "Toplama")
        }
        Button(onClick = { 
            
        }) {
            Text(text = "Çarpma")
            
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MVVMTheme {
        Sayfa()
    }
}