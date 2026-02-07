package com.example.aulajetpackcompose.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aulajetpackcompose.model.Postagem

@Composable
fun ItemPostagem(
    postagem: Postagem,
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier
            .padding(8.dp ,0.dp)

    ) {
        //Infos do Perfil
        Row(
            modifier = Modifier.padding(8.dp, 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(56.dp) // define o mesmo tamanho de width e height
                    .clip(CircleShape), // deixa o item arredondado
                painter = painterResource(id = postagem.imagePerfilRes),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Text(
                text = postagem.nome,
                modifier = Modifier.padding(start = 8.dp),
                style = MaterialTheme.typography.titleMedium,
            )
        }


        //Itens da postagem
        Image(
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(id = postagem.fotoRes),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Text(
            text = postagem.descricao,
            modifier = Modifier.padding(16.dp, 4.dp),
            style = MaterialTheme.typography.titleMedium,
        )

    }

}