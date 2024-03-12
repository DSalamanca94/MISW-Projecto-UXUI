package com.dsalamanca.movil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dsalamanca.movil.ui.theme.MovilTheme
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color // Import Color class
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.painter.Painter


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovilTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovilPage1DavidFelipeSalamanca(modifier: Modifier = Modifier) {
    Surface(
        color = Color(0xff2174d4),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 800.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart) // This might not be needed
                    .offset(x = 20.dp, y = 40.dp)
                    .requiredWidth(width = 319.dp)
                    .requiredHeight(height = 720.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                supportingText = {
                    Text(
                        text = "Usuario",
                        color = Color(0xff1d1b20),
                        lineHeight = 1.33.em,
                        style = TextStyle(
                            fontSize = 12.sp))
                },
                textStyle = MaterialTheme.typography.bodyLarge,
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color(0xff1d1b20),
                    containerColor = Color.White),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 364.dp)
                    .requiredWidth(width = 240.dp)
                    .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp)))
            StyleoutlinedStatehoveredTextConfigurationsinputtextLeadingIconfa(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 450.dp))
            Text(
                text = "¿No tienes cuenta? Registrate",
                color = Color(0xff49454f),
                textAlign = TextAlign.Center,
                lineHeight = 1.33.em,
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 610.dp)
                    .fillMaxWidth())
            Text(
                text = "Alarm Master",
                color = Color.Black,
                textAlign = TextAlign.Center,
                lineHeight = 0.14.em,
                style = TextStyle(
                    fontSize = 36.sp,
                    letterSpacing = 0.5.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 269.dp)
                    .requiredWidth(width = 240.dp)
                    .requiredHeight(height = 55.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Button(
                onClick = { },
                shape = RoundedCornerShape(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff014ba0)),
                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 102.dp,
                        y = 557.dp)
                    .requiredWidth(width = 155.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .requiredWidth(width = 155.dp)
                        .requiredHeight(height = 40.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Iniciar Sesion",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            lineHeight = 1.43.em,
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically))
                    }
                }
            }
            Image(
                painter = painterResource(id = R.drawable.despertador1),
                contentDescription = "despertador 1",
                modifier = Modifier
                    .width(145.dp) // Set the desired width
                    .height(145.dp) // Set the desired height
            )
        }
    }
}

@Composable
fun Image(painter: Painter, contentDescription: String, modifier: Any) {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StyleoutlinedStatehoveredTextConfigurationsinputtextLeadingIconfa(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 240.dp)
            .requiredHeight(height = 56.dp)
            .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    text = "Contraseña",
                    color = Color(0xff1d1b20),
                    lineHeight = 1.33.em,
                    style = TextStyle(
                        fontSize = 12.sp))
            },
            modifier = Modifier
                .requiredWidth(width = 240.dp)
                .requiredHeight(height = 56.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .offset(x = 0.dp,
                    y = 20.dp)
                .fillMaxWidth()
                .requiredHeight(height = 20.dp)
                .padding(start = 16.dp,
                    end = 16.dp,
                    top = 4.dp)
        ) {
            Text(
                text = "¿Olvidaste la contraseña?",
                color = Color(0xffb92f43),
                textDecoration = TextDecoration.Underline,
                lineHeight = 1.33.em,
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .fillMaxWidth())
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun MovilPage1DavidFelipeSalamancaPreview() {
    MovilPage1DavidFelipeSalamanca(Modifier)
}