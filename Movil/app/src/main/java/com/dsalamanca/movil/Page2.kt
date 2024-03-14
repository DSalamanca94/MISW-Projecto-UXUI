package com.dsalamanca.movil

import Navigation.AppScreens
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun MovilPage2(navController: NavController, modifier: Modifier = Modifier) {
//fun MovilPage2(modifier: Modifier = Modifier) {
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
                    .offset(
                        x = 20.dp,
                        y = 90.dp
                    )
                    .requiredSize(size = 320.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 129.dp)
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 271.dp)
                    .background(color = Color.White)
            ) {
                val tasks = mapOf(
                    "06:30 AM" to "Alarma para levantarse",
                    "07:00 AM" to "Empezar trabajo",
                    "08:00 AM" to "Revisar Correo",
                    "02:00 PM" to "Almuerzo",
                    "05:00 PM" to "Revisar Bodegas",
                    "06:00 PM" to "Revisar Correo",
                    "10:00 PM" to "Apagar Servidores"
                )

                TaskList(tasks,navController)
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 20.dp,
                        y = 439.dp
                    )
                    .requiredSize(size = 320.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 20.dp,
                        y = 483.dp
                    )
                    .requiredWidth(width = 320.dp)
                    .requiredHeight(height = 268.dp)
                    .background(color = Color.White)
            ) {
                val groups = mapOf(
                    "Grupo 1" to "Grupo de Trabajo",
                    "Grupo 2" to "Grupo de Familia",
                    "Grupo 3" to "Grupo Personal",
                    "Grupo 4" to "Grupo de Amigos",
                    "Grupo 5" to "Grupo de Bodegas",
                    "Grupo 6" to "Grupo de Panta",
                    "Grupo 7" to "Grupo de Universidad"
                )

                GroupList(groups)
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 40.dp,
                        y = 90.dp
                    )
                    .requiredWidth(width = 300.dp)
                    .requiredHeight(height = 50.dp)
            ) {
                AlarmsOption(navController = navController)
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 40.dp,
                        y = 440.dp
                    )
                    .requiredWidth(width = 300.dp)
                    .requiredHeight(height = 50.dp)
            ) {
                GroupsOption(navController = navController)
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 268.dp,
                        y = 40.dp
                    )
                    .requiredWidth(width = 72.dp)
                    .requiredHeight(height = 32.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .background(color = Color.White)
                    .border(
                        border = BorderStroke(1.dp, Color(0xff79747e)),
                        shape = RoundedCornerShape(30.dp)
                    )
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .requiredWidth(width = 32.dp)
                        .padding(all = 4.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.styleavatar),
                        contentDescription = "User images/User Images",
                        tint = Color.White,
                        modifier = Modifier
                            .clickable { navController.navigate(route = AppScreens.Page3.route) }
                            .background(color = Color(0xff0a5cb8))
                            .size(48.dp) // Ajusta el tamaño del icono aquí

                    )
                }
            }
        }
    }
}


@Composable
fun AlarmsOption(modifier: Modifier = Modifier,navController: NavController) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 300.dp)
            .requiredHeight(height = 50.dp)
            .padding(
                horizontal = 4.dp,
                vertical = 8.dp
            )
    ) {
        Text(
            text = "Alarms",
            color = Color(0xff0a5cb8),
            lineHeight = 0.67.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .requiredWidth(width = 80.dp)
                .requiredHeight(height = 28.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Icon(
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "Add Items",
            tint = Color(0xff0a5cb8) ,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(200.dp))
                .size(30.dp) // Ajusta el tamaño del icono aquí
                .clickable { navController.navigate(route = AppScreens.Page4.route) }
        )
    }
}
@Composable
fun GroupsOption(modifier: Modifier = Modifier,navController: NavController) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .requiredWidth(width = 300.dp)
            .requiredHeight(height = 50.dp)
            .padding(
                horizontal = 4.dp,
                vertical = 8.dp
            )
    ) {
        Text(
            text = "Groups",
            color = Color(0xff0a5cb8),
            lineHeight = 0.67.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .requiredWidth(width = 80.dp)
                .requiredHeight(height = 28.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Icon(
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "Add Items",
            tint = Color(0xff0a5cb8) ,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(200.dp))
                .size(30.dp) // Ajusta el tamaño del icono aquí
                .clickable { navController.navigate(route = AppScreens.Page5.route) }
        )
    }
}

@Composable
fun TaskList(tasks: Map<String, String>, navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        items(tasks.entries.toList()) { (time, task) ->
            TaskItem(time = time, task = task, navController = navController) // Pass navController
        }
    }
}

// Composable para un elemento de la tarea individual
@Composable
fun TaskItem(time: String, task: String,navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Control Toggle
        var isSwitchChecked by remember { mutableStateOf(true) } // Ejemplo de estado booleano

        MySwitch(
            checked = isSwitchChecked,
            onCheckedChange = { isSwitchChecked = it }
        )
        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = time,
                color = Color(0xff1d1b20),
                lineHeight = 1.2.em,
                style = TextStyle(fontSize = 20.sp, letterSpacing = 0.5.sp),
                modifier = Modifier.wrapContentWidth(align = Alignment.CenterHorizontally)
            )
            Text(
                text = task,
                color = Color(0xff49454f),
                lineHeight = 2.em,
                style = TextStyle(fontSize = 10.sp, letterSpacing = 0.25.sp),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.wrapContentSize()
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.delete_24px),
            contentDescription = "User images/User Images",
            tint = Color(0xFFB92F43),
            modifier = Modifier // Combine modifiers here
                .clickable { navController.navigate(route = AppScreens.Page6.route) } // Add click event
                .padding(horizontal = 8.dp) // Add padding
                .size(30.dp) // Set size
        )
    }
}

@Composable
fun GroupList(tasks: Map<String, String>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        items(tasks.entries.toList()) { (time, task) ->
            GroupItem(time = time, task = task)
        }
    }
}

// Composable para un elemento de la tarea individual
@Composable
fun GroupItem(time: String, task: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Control Toggle
        var isSwitchChecked by remember { mutableStateOf(true) } // Ejemplo de estado booleano

        MySwitch(
            checked = isSwitchChecked,
            onCheckedChange = { isSwitchChecked = it }
        )
        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = time,
                color = Color(0xff1d1b20),
                lineHeight = 1.2.em,
                style = TextStyle(fontSize = 20.sp, letterSpacing = 0.5.sp),
                modifier = Modifier.wrapContentWidth(align = Alignment.CenterHorizontally)
            )
            Text(
                text = task,
                color = Color(0xff49454f),
                lineHeight = 2.em,
                style = TextStyle(fontSize = 10.sp, letterSpacing = 0.25.sp),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.wrapContentSize()
            )
        }
        Icon(
            painter = painterResource(id = R.drawable.delete_24px),
            contentDescription = "User images/User Images",
            tint = Color(0xFFB92F43) ,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(200.dp))
                .size(30.dp) // Ajusta el tamaño del icono aquí
        )
    }
}
