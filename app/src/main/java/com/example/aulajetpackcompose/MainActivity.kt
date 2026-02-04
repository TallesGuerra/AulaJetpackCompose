package com.example.aulajetpackcompose

import android.R.attr.top
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aulajetpackcompose.model.Usuario
import com.example.aulajetpackcompose.ui.theme.AulaJetpackComposeTheme

class MainActivity : ComponentActivity() {

    private val usuarios = listOf(
        Usuario(
            nome = "Talles",
            idade = 33
        ),
        Usuario(
            nome = "Nanda",
            idade = 34
        ),
        Usuario(
            nome = "Talles",
            idade = 33
        ),
        Usuario(
            nome = "Nanda",
            idade = 34
        ),
        Usuario(
            nome = "Talles",
            idade = 33
        ),
        Usuario(
            nome = "Nanda",
            idade = 34
        ),
        Usuario(
            nome = "Talles",
            idade = 33
        ),
        Usuario(
            nome = "Nanda",
            idade = 34
        ),   Usuario(
            nome = "Talles",
            idade = 33
        ),
        Usuario(
            nome = "Nanda",
            idade = 34
        ),
        Usuario(
            nome = "Talles",
            idade = 33
        ),
        Usuario(
            nome = "Nanda",
            idade = 34
        ),
        Usuario(
            nome = "Talles",
            idade = 33
        ),
        Usuario(
            nome = "Nanda",
            idade = 34
        ),
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AulaJetpackComposeTheme {
                SegundoApp()
            }
        }


    } // Fechamento onCreate


    @Composable
    fun SegundoApp(){
        var contador by remember {
            mutableStateOf(0)
        }


        Column(
            modifier = Modifier
                .background(Color.Cyan)
                .padding(10.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) { // Inicio da Nova Interface

            Button(onClick = {
                contador
                Log.i("Meu App", "Contador: $contador")

            }) {
                Text(text = "Clique")
            }
            Text(text = "Contador: $contador")



        } // Fechamento Column



    } // Fechamento Segundo App



    @Composable
    fun PrimeiroApp() {
        Column(
            modifier = Modifier
                .background(Color.Gray)
                .padding(10.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {

        //LazyRow
        //LazyColumn
            /*LazyVerticalGrid(
                // Adapive » coloca uma largura minima e ela vai se adaptar ao item
                // Fixed » determina a qt de colunas e linhas

                //columns = GridCells.Adaptive(100.dp),
                columns = GridCells.Fixed(3),
                modifier = Modifier
                    .padding(16.dp)

            )*/
            LazyHorizontalGrid(
                // Adapive » coloca uma largura minima e ela vai se adaptar ao item
                // Fixed » determina a qt de colunas e linhas

                //columns = GridCells.Adaptive(100.dp),
                rows = GridCells.Fixed(3),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxHeight()


            ) {
                items(usuarios.size) { indice ->

                    val  nome = usuarios[indice].nome
                    val  idade = usuarios[indice].idade

                    Column(
                        modifier = Modifier
                            .padding( bottom = 16.dp, top = 16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Image(
                            painter = painterResource(R.drawable.carro),
                            contentDescription = null,
                            modifier = Modifier
                                .width(100.dp)
                                .height(100.dp),
                            contentScale = ContentScale.Fit,
                            alignment = Alignment.Center
                        )

                        Text(
                            text = "$nome"
                        )

                    }




                /*
                    Row(
                        modifier = Modifier
                            .padding( bottom = 16.dp, top = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){


                        Image(
                            painter = painterResource(R.drawable.carro),
                            contentDescription = null,
                            modifier = Modifier
                                .width(80.dp)
                                .height(80.dp),

                            contentScale = ContentScale.Fit,

                        )

                        Text(
                            text = "$nome -  $idade",
                            fontSize = 32.sp,
                            modifier = Modifier
                                .padding( start = 16.dp)

                        )
                    }*/ // Fechamento Row


                 /*   Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(Color.Yellow)

                    )
    */
                }

            }


            /*for (i in 1..4) {
                Image(
                    painter = painterResource(R.drawable.carro),
                    contentDescription = null,
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .border(2.dp, Color.Blue),

                    contentScale = ContentScale.Fit,
                    alignment = Alignment.Center
                )

            }
    */

    /*
            Image(
                painter = painterResource(R.drawable.carro),
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .border(2.dp, Color.Blue),
                contentScale = ContentScale.Fit,
                alignment = Alignment.Center
            )

            Icon(
                painter = painterResource(R.drawable.ic_alarm_24),
                contentDescription = null,
            )

            Button(onClick = {}) {
                Row {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null
                    )
                    Text(
                        text = "Desbloquear"
                    )
                }
            }*/
        }
    }


    @Preview
    @Composable
    fun AppPreview() {
        SegundoApp()
    }

} // Fechamento MainActivity


