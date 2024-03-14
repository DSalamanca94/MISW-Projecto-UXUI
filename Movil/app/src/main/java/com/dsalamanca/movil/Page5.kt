package com.dsalamanca.movil

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController

@Composable
fun MovilPage5(navController: NavController, modifier: Modifier = Modifier) {
    Surface(
        color = Color.White,
        border = BorderStroke(1.dp, Color.Black),
        modifier = modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 800.dp)
        ) {

            TextFieldLarge("Titulo",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp,y = 90.dp)
            )

            Box(
                modifier = Modifier
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 800.dp)
            ) {

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 190.dp
                        )
                        .requiredWidth(width = 320.dp)
                        .requiredHeight(height = 150.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color.White)
                )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 20.dp, y = 170.dp)
                        .requiredWidth(width = 320.dp)
                        .requiredHeight(height = 170.dp)
                        .background(color = Color.White)
                ) {
                    AlarmsOption(navController = navController)
                    val tasks = mapOf(
                        "06:30 AM" to "Alarma para levantarse",
                        "07:00 AM" to "Empezar trabajo",
                        "08:00 AM" to "Revisar Correo",
                        "02:00 PM" to "Almuerzo",
                        "05:00 PM" to "Revisar Bodegas",
                        "06:00 PM" to "Revisar Correo",
                        "10:00 PM" to "Apagar Servidores"
                    )
                    Box(
                        modifier = Modifier
                            .offset(x = 0.dp, y = 35.dp)
                    ){
                        //TaskList(tasks,navController)
                    }


                }

            }

            NavegacionBlack("Agregar / Editar  Grupo",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 5.dp,
                        y = 40.dp),navController)

            val idiomas = listOf(
                "es" to "Español",
                "en" to "Inglés",
                "fr" to "Francés",
                "de" to "Alemán"
            )


            Image(
                painter = painterResource(id = R.drawable.thumbnail),
                contentDescription = "despertador",
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .offset(x = 20.dp,y = 200.dp)
                    .requiredWidth(width = 200.dp)
                    .requiredHeight(height = 600.dp),
                colorFilter = ColorFilter.tint(Color(0xff1d1b20))
            )

            Button(
                onClick = { },
                shape = RoundedCornerShape(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff014ba0)),
                contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 103.dp,
                        y = 720.dp)
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
            SelectorUbicacion(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp,
                        y = 399.dp))

        }
    }
}
