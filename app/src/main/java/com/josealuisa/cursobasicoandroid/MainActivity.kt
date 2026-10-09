package com.josealuisa.cursobasicoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.josealuisa.cursobasicoandroid.composables.ButtonExample
import com.josealuisa.cursobasicoandroid.composables.ImageExample
import com.josealuisa.cursobasicoandroid.composables.TextExample
import com.josealuisa.cursobasicoandroid.ui.theme.CursoBasicoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoBasicoAndroidTheme {
                TextExample(name= "josealuisa")
                ImageExample()
                ButtonExample()


            }
        }
    }
}




@Preview
@Composable
fun Example() {
    Text(text = "Hola, es", fontSize = 40.sp)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoBasicoAndroidTheme {
        Greeting("Android")
    }
}