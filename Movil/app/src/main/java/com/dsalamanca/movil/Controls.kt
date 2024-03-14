package com.dsalamanca.movil

import Navigation.AppScreens
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextField(textLabel: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 240.dp)
            .requiredHeight(height = 76.dp) // Ajusta la altura para acomodar el espacio del texto
            .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
    ) {
        Text(
            text = textLabel,
            color = Color(0xff1d1b20),
            lineHeight = 1.33.em,
            style = TextStyle(
                fontSize = 12.sp
            ),
            modifier = Modifier
                .align(Alignment.TopStart) // Alinea el texto en la parte superior izquierda
                .padding(start = 16.dp, top = 8.dp) // Ajusta el espaciado del texto
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            textStyle = MaterialTheme.typography.bodyLarge,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color(0xff1d1b20),
                containerColor = Color.Transparent
            ),
            modifier = Modifier
                .fillMaxWidth() // Llena el ancho disponible
                .align(Alignment.BottomStart) // Alinea la caja de texto en la parte inferior izquierda
                .padding(top = 24.dp) // Ajusta el espacio entre el texto y la caja de texto
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldLarge(textLabel: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 320.dp)
            .requiredHeight(height = 76.dp) // Ajusta la altura para acomodar el espacio del texto
            .clip(shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
    ) {
        Text(
            text = textLabel,
            color = Color(0xff1d1b20),
            lineHeight = 1.33.em,
            style = TextStyle(
                fontSize = 12.sp
            ),
            modifier = Modifier
                .align(Alignment.TopStart) // Alinea el texto en la parte superior izquierda
                .padding(start = 16.dp, top = 8.dp) // Ajusta el espaciado del texto
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            textStyle = MaterialTheme.typography.bodyLarge,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color(0xff1d1b20),
                containerColor = Color.Transparent
            ),
            modifier = Modifier
                .fillMaxWidth() // Llena el ancho disponible
                .align(Alignment.BottomStart) // Alinea la caja de texto en la parte inferior izquierda
                .padding(top = 24.dp) // Ajusta el espacio entre el texto y la caja de texto
        )
    }
}
@Composable
fun KeyboardPicker(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Top),
        modifier = modifier
            .requiredWidth(width = 320.dp)
            .requiredHeight(height = 127.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .background(color = Color(0xff2174d4).copy(alpha = 0.25f))
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(height = 95.dp)
                    .padding(horizontal = 24.dp)
            ) {
                Row(
                    modifier = Modifier
                        .weight(weight = 1f)
                ) {
                    SelectedtrueHoras(
                        modifier = Modifier
                            .weight(weight = 0.5f))
                    Text(
                        text = ":",
                        color = Color(0xff1d1b20),
                        textAlign = TextAlign.Center,
                        lineHeight = 1.12.em,
                        style = TextStyle(
                            fontSize = 57.sp),
                        modifier = Modifier
                            .requiredWidth(width = 24.dp)
                            .requiredHeight(height = 72.dp)
                            .wrapContentHeight(align = Alignment.CenterVertically))
                    SelectedtrueMinutes(
                        modifier = Modifier
                            .weight(weight = 0.5f))
                }
                AMPMFalseStateEnabledNw()
            }
        }
    }
}

@Composable
fun SelectedtrueHoras(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.Top),
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(1.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 72.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(color = Color(0xff8fb6e4))
                .border(
                    border = BorderStroke(2.dp, Color(0xff014ba0)),
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(
                    horizontal = 16.dp,
                    vertical = 9.dp
                )
        ) {
            Text(
                text = "00",
                color = Color(0xff21005d),
                textAlign = TextAlign.Center,
                lineHeight = 1.16.em,
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 2.dp)
                    .requiredHeight(height = 42.dp)
                    .background(color = Color(0xff014ba0)))
        }
        Text(
            text = "Horas",
            color = Color(0xff49454f),
            lineHeight = 1.33.em,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .fillMaxWidth())
    }
}
@Composable
fun SelectedtrueMinutes(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(7.dp, Alignment.Top),
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(1.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 72.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(color = Color(0xff8fb6e4))
                .border(
                    border = BorderStroke(2.dp, Color(0xff014ba0)),
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(
                    horizontal = 16.dp,
                    vertical = 9.dp
                )
        ) {
            Text(
                text = "00",
                color = Color(0xff21005d),
                textAlign = TextAlign.Center,
                lineHeight = 1.16.em,
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 2.dp)
                    .requiredHeight(height = 42.dp)
                    .background(color = Color(0xff014ba0)))
        }
        Text(
            text = "Minutos",
            color = Color(0xff49454f),
            lineHeight = 1.33.em,
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .fillMaxWidth())
    }
}


@Composable
fun AMPMFalseStateEnabledNw(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .requiredWidth(width = 52.dp)
            .requiredHeight(height = 72.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color(0xfffbfbfb))
            .border(
                border = BorderStroke(1.dp, Color(0xff1d1b20)),
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .weight(weight = 0.5f)
                .background(color = Color(0xff2174d4))
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = 10.dp,
                        vertical = 8.dp
                    )
            ) {
                Text(
                    text = "AM",
                    color = Color(0xff31111d),
                    textAlign = TextAlign.Center,
                    lineHeight = 1.5.em,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        letterSpacing = 0.15.sp))
            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .weight(weight = 0.5f)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = 10.dp,
                        vertical = 8.dp
                    )
            ) {
                Text(
                    text = "PM",
                    color = Color(0xff49454f),
                    textAlign = TextAlign.Center,
                    lineHeight = 1.5.em,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        letterSpacing = 0.15.sp))
            }
        }
    }
}

@Composable
fun NavegacionWhite(textLabel: String,modifier: Modifier = Modifier,navController: NavController) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 50.dp)
            .padding(
                horizontal = 4.dp,
                vertical = 8.dp
            )
    ) {
        IconButton(
            onClick = { navController.navigate(route = AppScreens.Page2.route)}
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredSize(size = 48.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(100.dp))
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(all = 8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_back_24px),
                            contentDescription = "User images/User Images",
                            tint = Color.White,
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(200.dp))
                                .size(48.dp) // Ajusta el tamaño del icono aquí
                        )

                    }
                }
            }
        }
        Text(
            text = textLabel,
            color = Color.White,
            lineHeight = 0.67.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}


@Composable
fun NavegacionBlack(textLabel: String,modifier: Modifier = Modifier,navController: NavController) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 50.dp)
            .padding(
                horizontal = 4.dp,
                vertical = 8.dp
            )
    ) {
        IconButton(
            onClick = { navController.navigate(route = AppScreens.Page2.route)}
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .requiredSize(size = 48.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(100.dp))
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(all = 8.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.arrow_back_24px),
                            contentDescription = "User images/User Images",
                            tint = Color.Black,
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(200.dp))
                                .size(48.dp) // Ajusta el tamaño del icono aquí
                        )

                    }
                }
            }
        }
        Text(
            text = textLabel,
            color = Color.Black,
            lineHeight = 0.67.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}

@Composable
fun SelectorUbicacion(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 186.dp)
            .requiredHeight(height = 50.dp)
    ) {
        SelectedtrueStateenabledIconfalse22(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 134.dp,
                    y = 11.dp))
        ConfigurationsmallElevationflat22()
    }
}

@Composable
fun SelectedtrueStateenabledIconfalse22(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 52.dp)
            .requiredHeight(height = 30.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color(0xff20f26f)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.CenterEnd)
                .offset(x = 8.dp,
                    y = 0.dp)
                .requiredSize(size = 48.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .offset(x = 0.dp,
                        y = 0.dp)
                    .requiredSize(size = 24.dp)
                    .clip(shape = RoundedCornerShape(23.dp))
                    .background(color = Color.White))
        }
    }
}

@Composable
fun ConfigurationsmallElevationflat22(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 121.dp)
            .requiredHeight(height = 50.dp)
            .padding(horizontal = 4.dp,
                vertical = 8.dp)
    ) {
        Text(
            text = "Ubicacion",
            color = Color(0xff49454f),
            lineHeight = 0.8.em,
            style = TextStyle(
                fontSize = 20.sp),
            modifier = Modifier
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 28.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}

@Composable
fun Image(
    painter: Painter,
    contentDescription: String,
    modifier: Modifier,
    colorFilter: ColorFilter
) {
    androidx.compose.foundation.Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier
    )
}
@Preview(widthDp = 186, heightDp = 50)
@Composable
private fun Group5Preview() {
    SelectorUbicacion(Modifier)
}


@Composable
fun MySwitch(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.White, // Color blanco para la bolita en estado positivo
            checkedTrackColor = Color(0xff20f26f), // Verde para el fondo en estado positivo
            uncheckedThumbColor = Color.Gray, // Gris para la bolita en estado negativo
            uncheckedTrackColor = Color.LightGray // Gris claro para el fondo en estado negativo
        ),
        modifier = modifier
    )
}

@Composable
fun KeyboardPicker2(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color(0xfffbfbfb))
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "Selecciona una hora",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    letterSpacing = 0.15.sp
                ),
                color = Color(0xff49454f)
            )
        }


    }
}
