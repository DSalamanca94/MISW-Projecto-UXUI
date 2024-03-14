package com.dsalamanca.movil

import Navigation.AppScreens
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController

@Composable
fun MovilPage3(navController: NavController, modifier: Modifier = Modifier) {
    Surface(
        color = Color(0xff2174d4),
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 800.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp,
                        y = 111.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 649.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White))
            Button(
                onClick = {navController.navigate(route = AppScreens.Page2.route) },
                shape = RoundedCornerShape(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff014ba0)),
                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 102.dp,
                        y = 632.dp)
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
                            text = "Guardar",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            lineHeight = 1.43.em,
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier
                                .wrapContentHeight(align = Alignment.CenterVertically))
                    }
                }
            }
            TextField(
                textLabel = "Nombre:",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 365.dp))
            TextField(
                textLabel = "Correo:",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 445.dp))

            TextField(
                textLabel = "Contraseña:",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 60.dp,
                        y = 525.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 118.dp,
                        y = 165.dp)
                    .requiredWidth(width = 124.dp)
                    .requiredHeight(height = 171.dp)
                    .padding(all = 4.dp)
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.styleavatar),
                    contentDescription = "User images/User Images",
                    tint = Color.White,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(300.dp))
                        .background(color = Color(0xff0a5cb8))
                        .size(300.dp) // Ajusta el tamaño del icono aquí
                )

            }
            NavegacionWhite("Informacion del Usuario",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 40.dp)
                ,navController)
        }
    }
}
