package com.example.aulajetpackcompose

import android.R.attr.horizontalDivider
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aulajetpackcompose.componentes.AreaDestaque
import com.example.aulajetpackcompose.componentes.AreaPostagem
import com.example.aulajetpackcompose.componentes.BarraInferior
import com.example.aulajetpackcompose.componentes.BarraSuperior
import com.example.aulajetpackcompose.model.Destaque
import com.example.aulajetpackcompose.model.Postagem
import com.example.aulajetpackcompose.ui.theme.AulaJetpackComposeTheme

class InstagramActivity : ComponentActivity() {
    private val listaDestaques = listOf(
        Destaque(R.drawable.perfil_02, "Talles"),
        Destaque(R.drawable.perfil_02, "Fernanda"),
        Destaque(R.drawable.perfil_03, "Piettro"),
        Destaque(R.drawable.perfil_03, "Julia"),
        Destaque(R.drawable.perfil_03, "Benjamin"),
        Destaque(R.drawable.perfil_03, "Gustavo"),
        Destaque(R.drawable.perfil_02, "Talles"),
        Destaque(R.drawable.perfil_02, "Fernanda"),
        Destaque(R.drawable.perfil_03, "Piettro"),
        Destaque(R.drawable.perfil_03, "Julia"),
        Destaque(R.drawable.perfil_03, "Benjamin"),
        Destaque(R.drawable.perfil_03, "Gustavo"),
        Destaque(R.drawable.perfil_02, "Talles"),
        Destaque(R.drawable.perfil_02, "Fernanda"),
        Destaque(R.drawable.perfil_03, "Piettro"),
        Destaque(R.drawable.perfil_03, "Julia"),
        Destaque(R.drawable.perfil_03, "Benjamin"),
        Destaque(R.drawable.perfil_03, "Gustavo"),
        Destaque(R.drawable.perfil_02, "Talles"),
        Destaque(R.drawable.perfil_02, "Fernanda"),
        Destaque(R.drawable.perfil_03, "Piettro"),
        Destaque(R.drawable.perfil_03, "Julia"),
        Destaque(R.drawable.perfil_03, "Benjamin"),
        Destaque(R.drawable.perfil_03, "Gustavo"),
        Destaque(R.drawable.perfil_02, "Talles"),
        Destaque(R.drawable.perfil_02, "Fernanda"),
        Destaque(R.drawable.perfil_03, "Piettro"),
        Destaque(R.drawable.perfil_03, "Julia"),
        Destaque(R.drawable.perfil_03, "Benjamin"),
        Destaque(R.drawable.perfil_03, "Gustavo"),

        )

    private val listaPostagens = listOf(
        Postagem(R.drawable.perfil_02, "Talles", R.drawable.floresta, "Floresta"),
        Postagem(R.drawable.perfil_02, "Fernanda", R.drawable.praia, "Praia"),
        Postagem(R.drawable.perfil_02, "Piettro", R.drawable.carro, "Carro"),
        Postagem(R.drawable.perfil_02, "Talles", R.drawable.floresta, "Floresta"),
        Postagem(R.drawable.perfil_02, "Fernanda", R.drawable.praia, "Praia"),
        Postagem(R.drawable.perfil_02, "Piettro", R.drawable.carro, "Carro"),
        Postagem(R.drawable.perfil_02, "Talles", R.drawable.floresta, "Floresta"),
        Postagem(R.drawable.perfil_02, "Fernanda", R.drawable.praia, "Praia"),
        Postagem(R.drawable.perfil_02, "Piettro", R.drawable.carro, "Carro"),
        Postagem(R.drawable.perfil_02, "Talles", R.drawable.floresta, "Floresta"),
        Postagem(R.drawable.perfil_02, "Fernanda", R.drawable.praia, "Praia"),
        Postagem(R.drawable.perfil_02, "Piettro", R.drawable.carro, "Carro"),
        Postagem(R.drawable.perfil_02, "Talles", R.drawable.floresta, "Floresta"),
        Postagem(R.drawable.perfil_02, "Fernanda", R.drawable.praia, "Praia"),
        Postagem(R.drawable.perfil_02, "Piettro", R.drawable.carro, "Carro"),
        Postagem(R.drawable.perfil_02, "Talles", R.drawable.floresta, "Floresta"),
        Postagem(R.drawable.perfil_02, "Fernanda", R.drawable.praia, "Praia"),
        Postagem(R.drawable.perfil_02, "Piettro", R.drawable.carro, "Carro"),


        )


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AulaJetpackComposeTheme {
                Scaffold(
                    topBar = { BarraSuperior() },
                    bottomBar = { BarraInferior() },

                    /*floatingActionButton = {
                        FloatingActionButton(onClick = { */
                    /*TODO*/
                    /* }) {
                         IIcon(
                               painter = painterResource(R.drawable.ic_add_24),
                               contentDescription = "Botão de adicionar"
                               )
                }
            },*/

                    //floatingActionButtonPosition = FabPosition.End  /* é o padrão, por isso nao é preciso utilizar*/

                ) { paddingInterno ->
                    Home(Modifier.padding(paddingInterno))

                }
            }
        }
    }// Fechamento onCreate

    @Composable
    fun Home(modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .padding(16.dp)
                .fillMaxWidth()

        ) {
            // Área de destaque
            AreaDestaque(listaDestaques)

            HorizontalDivider()

            // Postagens
            AreaPostagem(listaPostagens)

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun AppPreview() {
        AulaJetpackComposeTheme {
            Home()
        }
    }

}// Fechamento Activity
