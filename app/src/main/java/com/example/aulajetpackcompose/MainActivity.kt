package com.example.aulajetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aulajetpackcompose.ui.theme.AulaJetpackComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AulaJetpackComposeTheme {
            //Scaffold organiza a estrutura; Surface define a aparência da superfície. 
            
                PrimeiroApp()




            } //Fechamento theme
        }
    }
}
//fechamento MainACtivity


@Composable
fun PrimeiroApp(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background( Color.Gray ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.End
        // Center,Top, Bottom, SpaceBetween, SpaceAround, SpaceEvenly(espaço igual entre todos os items
        //horizontalAlignment » Start, CenterHorizontally e End

        /*  para ROW vai ser:
        horizontalArrangement
        Arragenment » End, Center e Start
        paceBetween, SpaceAround, SpaceEvenly(espaço igual entre todos os items)    
        
        verticalAlignment » Top, Bottom e CenterVertically
        */
    ) {

        Text( text = "Talles", fontSize = 36.sp )
        Text( text = "Nanda", fontSize = 36.sp )

        ButtonTeste(texto = "Talles Guerra"){
        println("executou")
         }


    } // Fim Column
 
}
 //Fim da fun PrimeiroApp

@Preview
@Composable
fun PrimeiroAppPreview(){
     PrimeiroApp()
}

