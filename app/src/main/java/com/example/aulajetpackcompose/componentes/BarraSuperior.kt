package com.example.aulajetpackcompose.componentes

import android.R.attr.navigationIcon
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MonochromePhotos
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BarraSuperior(
    modifier: Modifier = Modifier
){
    TopAppBar(
        modifier = modifier,
        title = {
            Text(text = "Instagram")
        },

     /*   colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue, //
            titleContentColor = Color.White, // Título
            navigationIconContentColor = Color.White, // Ícone do menu
            actionIconContentColor = Color.White // Ícone de ação
        ),

        navigationIcon = {
            Icon(
                imageVector = Icons.Default.MonochromePhotos,
                contentDescription = "Ícone de menu"
            )
        },*/

        actions = {
            Row{
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null
                    )
                }
            }
        }
    )

}

@Preview
@Composable
fun BarraSuperiorPreview(){
    BarraSuperior()
}