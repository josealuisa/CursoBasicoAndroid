package com.josealuisa.cursobasicoandroid.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ProfileScreen(){
    Row (modifier = Modifier.padding(all= 22.dp)){
        Column {
            Text("José E. Aluisa")
            Text("Mobile Developer")
        }
            Button(onClick = {}) {
                Text("Follow")
            }
    }
}