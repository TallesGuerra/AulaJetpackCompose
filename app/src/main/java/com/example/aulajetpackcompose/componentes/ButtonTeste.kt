package com.example.aulajetpackcompose.componentes


@Composable
fun ButtonTeste(
    // Para deixar o Button customizavel
     texto: String,
     onClick: () ->
){
    Button(
        onClick = onClick,
        mofier = Modifier.fillMaxWidth()
        ) {
        Text(text = "+ ")
        Text(text = texto) // aplico o texto do paramentro de cima
        Text(text = " +")
    }
}


@Preview
@Composable
fun ButtonTestePreview(){
    ButtonTeste(texto = "Talles Guerra"){
        println("executou")
    }
}