package com.example.aplicacaojetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android" , "Jetpack Compose"))
        }
    }
}

data class Message(val author:String, val body: String)

@Composable
fun MessageCard(msg: Message){

    //colocar os elementos HORIZONTALMENTE
    Row (modifier = Modifier.padding(all = 36.dp)){//todos os elementos terao um padding de 36.dp
        Image(painter = painterResource(R.drawable.pinguim),
            contentDescription = "Servico de Manutencao",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

    }

    //colocar os elementos VERTICALMENTE
    Column {
        Text(text = msg.author)
        Text(text = msg.body)
        Spacer(modifier = Modifier.height(4.dp))

    }

}


@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard(msg = Message("Android" , "Jetpack Compose"))
}