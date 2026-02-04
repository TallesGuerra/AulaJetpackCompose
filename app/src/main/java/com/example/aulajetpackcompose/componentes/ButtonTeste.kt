package com.example.aulajetpackcompose.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ButtonTeste(
    // Para deixar o Button customizavel
     texto: String,
     onClick: () -> Unit
)
{
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
        ) {
        Text(text = "+ ")
        Text(text = texto) // aplico o texto do paramentro de cima
        Text(text = " +")
    }
}

/*
@Composable
fun PerfilUsuaruio(){
    Column(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .clip(CircleShape)
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "TG", fontSize = 36.sp)

    }
}
*/




@Preview
@Composable
fun ButtonTestePreview(){
    ButtonTeste(texto = "Talles Guerra"){
        println("executou")
    }
}