package com.example.aplicacaojetpack

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.work.Configuration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme{
                Surface(modifier = Modifier.fillMaxSize()) {
                    MessageCard(Message("Android" , "Jetpack Compose"))
                    Conversation(SampleData.conversationSample)
                }
            }
        }

        //Ativar tema escuro
        @Preview(name = "Light Mode")
        @Preview(
            uiMode = Configuration.UI_MODE_NIGHT_YES,
            showBackground = true,
            name = "Dark Mode"
        )

        @Composable
        fun Conversation(messages: List<Message>){
            LazyColumn{
                items(messages) { message ->
                    MessageCard(message)
                }
            }
        }


        data class Message(val author:String, val body: String)

        @Composable
        fun MessageCard(msg: Message){

            //colocar os elementos HORIZONTALMENTE
            Row (modifier = Modifier.padding(all = 8.dp)){//todos os elementos terao um padding de 8.dp
                Image(
                    painter = painterResource(R.drawable.pinguim),
                    contentDescription = "null",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .border(1.5,dp, MaterialTheme.colors.secunday, CircleShape) //definir o estilo com as cores do tema envolvido
                )
                Spacer(modifier = Modifier.width(8.dp))

                //Acompanhamos se a mensagem é expandida ou não está variável
                var isExpanded by remember { mutableStateOf (false) }

                //surfaceColor será atualizado gradualmente de uma cor para outra
                val surfaceColor by animateColorAsState(
                    if (isExpanded) MaterialTheme.colors.primary else MaterialTheme.colors.surface,
                )

                //Alteramos a variável isExpanded quando clicamos nesta coluna
                Column(modifier = Modifier.clickable { isExpanded = !isExpanded }){
                    Text(
                        text = msg.author
                                color = MaterialTheme.colors.secundayVariant,
                        style = MaterialTheme.typography.subtitle2
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Surface(
                        shape = MaterialTheme.shapes.medium, elevation = 1.dp, //personalizar a forma corpo da mensagem
                        color = surfaceColor, //a cor da surfaceColor mudara gradualmente de primaria para surface
                        modifier = Modifier.animateContentSize().padding(1.dp) //animateContentSize mudará o tamanho da surface gradualmente
                    ){
                        text = msg.body,
                        modifier = Modifier.padding(all = 4dp),
                        //Se a mensagem for expandida, exibimos todo o seu conteúdo
                        //caso contrario, exibimos apenas a primeira linha
                        maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                        style = MaterialTheme.typography.body2
                    }
                }

            }
        }
    }

    @Preview
    @Composable
    fun PreviewConversation(){
        ComposeTutorialTheme{
            Conversation(SampleData.conversationSample)
        }
    }
