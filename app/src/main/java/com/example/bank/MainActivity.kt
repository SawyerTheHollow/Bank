package com.example.bank

import android.os.Bundle
import android.print.PrintAttributes.Margins
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.collection.objectIntMapOf
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.bank.ui.theme.BankTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(Modifier.background(color = Color.DarkGray).fillMaxSize()) {
            scrollBox()
                permission()
            }
        }
    }
}

@Composable
fun permission() {
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.RequestPermission()){
    }
}


fun click() {
    var mock = 0
}
@Composable
fun topMenu(
) {
    var text = "Поиск"
Row(
    modifier = Modifier.height(60.dp).fillMaxWidth().background(Color.DarkGray),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceEvenly
) {

    Icon(imageVector = Icons.Rounded.AccountBox,
        contentDescription = "Account box",
        modifier = Modifier.size(50.dp),
        tint = Color.White
    )

        FilledTonalButton(onClick = { click() },
            shape = RoundedCornerShape(30),
            modifier = Modifier.width(250.dp).height(40.dp),
            colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0.5f),
            contentColor = Color.White,
            disabledContentColor = Color.Red,
            disabledContainerColor = Color.Blue,),
            contentPadding = PaddingValues(0.dp)
    ) {

            Text(
                text = "Поиск",
                modifier = Modifier.fillMaxSize().padding(10.dp)
            )
    }

        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = "Prime button",
            Modifier.size(40.dp),
            tint = Color.White

        )

        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "All services button",
            Modifier.size(40.dp),
            tint = Color.White
        )
}
}
@Composable
fun scrollBox() {
    Column(modifier = Modifier.fillMaxSize().padding(5.dp, top = 80.dp).verticalScroll(rememberScrollState())) {

        Row(modifier = Modifier.height(45.dp)) {

            Column() {

                Text(
                    text = "В кошельке",
                )

                Text(
                    fontSize = 5.em,
                    text = "500.75 ₽ >",
                )
            }

            Row(modifier = Modifier.weight(1f).fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End) {

                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "All services button",
                    Modifier.size(30.dp),
                    tint = Color.White
                )

                Box(modifier = Modifier.padding(start = 10.dp)){

                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "All services button",
                        Modifier.size(30.dp),
                        tint = Color.White
                    )
                }
            }
        }
        Row(modifier = Modifier.fillMaxWidth().height(150.dp).horizontalScroll(rememberScrollState())) {
            Column(modifier = Modifier.fillMaxHeight().width(60.dp)) {
                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(30),
                    contentPadding = PaddingValues(5.dp),
                    colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0.5f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth().padding(bottom = 5.dp)) {

                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "QR code scan button",
                            Modifier.fillMaxSize(),
                            tint = Color.White
                        )
                }
                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(30),
                    contentPadding = PaddingValues(5.dp),
                    colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0.5f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxSize().padding(top = 5.dp)){

                        Icon(
                            imageVector = Icons.Rounded.Lock,
                            contentDescription = "Security button",
                            Modifier.fillMaxSize(),
                            tint = Color.White
                        )
                }
            }

            FilledTonalButton(onClick = { click() },
                shape = RoundedCornerShape(20),
                contentPadding = PaddingValues(15.dp),
                colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0.5f),
                    contentColor = Color.White,
                    disabledContentColor = Color.Red,
                    disabledContainerColor = Color.Blue,),
                modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Card icon",
                            tint = Color.White,
                            modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                        )
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.7f),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "500.75 ₽",
                        modifier = Modifier)
                    }
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "MasterCard ... **0000",
                            fontSize = 2.2.em)
                    }
                }
            }
            FilledTonalButton(onClick = { click() },
                shape = RoundedCornerShape(20),
                contentPadding = PaddingValues(15.dp),
                colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0.5f),
                    contentColor = Color.White,
                    disabledContentColor = Color.Red,
                    disabledContainerColor = Color.Blue,),
                modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Card icon",
                        tint = Color.White,
                        modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                    )
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.7f),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "0 ₽",
                            modifier = Modifier)
                    }
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "Mir **1111",
                            fontSize = 2.2.em)
                    }
                }
            }
            FilledTonalButton(onClick = { click() },
                shape = RoundedCornerShape(20),
                contentPadding = PaddingValues(15.dp),
                colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0.5f),
                    contentColor = Color.White,
                    disabledContentColor = Color.Red,
                    disabledContainerColor = Color.Blue,),
                modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Card icon",
                        tint = Color.White,
                        modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                    )
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.7f),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "331",
                            modifier = Modifier)
                    }
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "СберСпасибо",
                            fontSize = 2.2.em)
                    }
                }
            }
            FilledTonalButton(onClick = { click() },
                shape = RoundedCornerShape(20),
                contentPadding = PaddingValues(15.dp),
                colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0.5f),
                    contentColor = Color.White,
                    disabledContentColor = Color.Red,
                    disabledContainerColor = Color.Blue,),
                modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {
                    Icon(
                        imageVector = Icons.Default.AddCircle,
                        contentDescription = "Card icon",
                        tint = Color.White,
                        modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                    )
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.7f),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "Оформить",
                            modifier = Modifier)
                    }
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "Карту или счёт",
                            fontSize = 2.2.em)
                    }
                }
            }
            FilledTonalButton(onClick = { click() },
                shape = RoundedCornerShape(20),
                contentPadding = PaddingValues(15.dp),
                colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0.5f),
                    contentColor = Color.White,
                    disabledContentColor = Color.Red,
                    disabledContainerColor = Color.Blue,),
                modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                Column(modifier = Modifier.fillMaxSize()) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "Card icon",
                        tint = Color.White,
                        modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                    )
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.7f),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "Все счета",
                            modifier = Modifier)
                    }
                    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                        verticalAlignment = Alignment.Bottom) {
                        Text(text = "Карты и бонусы",
                            fontSize = 2.2.em)
                    }
                }
            }
        }
        Column(modifier = Modifier.padding(top = 10.dp).background(color = Color.Gray, shape = RoundedCornerShape(20.dp)).height(200.dp).fillMaxWidth().clip(shape = RoundedCornerShape(20.dp)),) {

            Text(text = "Переводы",
                fontSize = 5.em,
                modifier = Modifier.fillMaxWidth().height(50.dp).padding(10.dp))

            Row(modifier = Modifier.fillMaxSize().padding(top = 10.dp, start = 10.dp, bottom = 10.dp).horizontalScroll(rememberScrollState())
            ) {

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(5.dp),
                    colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(100.dp).padding(start = 5.dp)){

                    Column(verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()) {

                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "Card icon",
                            tint = Color.White,
                            modifier = Modifier.height(80.dp).width(80.dp).background(color = Color.Green, shape = RoundedCornerShape(20.dp)).padding(20.dp)
                        )

                        Text(text = "Новый перевод", textAlign = TextAlign.Center)
                    }
                }

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(5.dp),
                    colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(100.dp)){

                    Column(verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()) {

                        Box(
                            modifier = Modifier.height(80.dp).width(80.dp).background(color = Color.DarkGray, shape = RoundedCornerShape(20.dp)).padding(20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "ИС",
                                textAlign = TextAlign.Center,
                                fontSize = 6.em,
                                modifier = Modifier.fillMaxSize())
                        }

                        Text(text = "Илья Сергеевич", textAlign = TextAlign.Center)
                    }
                }
                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(5.dp),
                    colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(100.dp)){

                    Column(verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()) {

                        Box(
                            modifier = Modifier.height(80.dp).width(80.dp).background(color = Color.DarkGray, shape = RoundedCornerShape(20.dp)).padding(20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "ИС",
                                textAlign = TextAlign.Center,
                                fontSize = 6.em,
                                modifier = Modifier.fillMaxSize())
                        }

                        Text(text = "Илья Сергеевич", textAlign = TextAlign.Center)
                    }
                }
                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(5.dp),
                    colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(100.dp)){

                    Column(verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()) {

                        Box(
                            modifier = Modifier.height(80.dp).width(80.dp).background(color = Color.DarkGray, shape = RoundedCornerShape(20.dp)).padding(20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "ИС",
                                textAlign = TextAlign.Center,
                                fontSize = 6.em,
                                modifier = Modifier.fillMaxSize())
                        }

                        Text(text = "Илья Сергеевич", textAlign = TextAlign.Center)
                    }
                }
                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(5.dp),
                    colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(100.dp)){

                    Column(verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()) {

                        Icon(
                            imageVector = Icons.Default.Send,
                            contentDescription = "icon",
                            tint = Color.White,
                            modifier = Modifier.height(80.dp).width(80.dp).background(color = Color.DarkGray, shape = RoundedCornerShape(20.dp)).padding(20.dp)
                        )

                        Text(text = "Чаты и сборы", textAlign = TextAlign.Center)
                    }
                }
            }
        }
        Column(modifier = Modifier.padding(top = 10.dp).background(color = Color.Gray, shape = RoundedCornerShape(20.dp)).height(250.dp).fillMaxWidth().clip(shape = RoundedCornerShape(20.dp)),) {
            Row(modifier = Modifier.fillMaxWidth().height(50.dp)) {
                Column() {
                    Text(text = "Расходы в декабре",
                        fontSize = 5.em,
                        modifier = Modifier.padding(10.dp))
                }
                Column(horizontalAlignment = Alignment.End,
                    modifier = Modifier.fillMaxSize()) {
                    FilledTonalButton(onClick = { click() },
                        shape = RoundedCornerShape(20),
                        contentPadding = PaddingValues(5.dp),
                        colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0f),
                            contentColor = Color.White,
                            disabledContentColor = Color.Red,
                            disabledContainerColor = Color.Blue,),
                        modifier = Modifier.fillMaxHeight().width(70.dp)){

                        Text(text = "Все",
                            fontSize = 4.em,
                            color = Color.Green)
                    }
                }
            }

            Row(modifier = Modifier.fillMaxSize().padding(top = 10.dp, start = 10.dp, bottom = 10.dp).horizontalScroll(rememberScrollState())
            ) {
                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(15.dp),
                    colors = ButtonColors(containerColor = Color.DarkGray.copy(alpha = 0.2f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Card icon",
                            tint = Color.White,
                            modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                        )
                        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.7f),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Bottom) {
                            Text(text = "2000 ₽",
                                fontSize = 4.em)
                        }
                        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                            verticalAlignment = Alignment.Bottom) {
                            Text(text = "Все расходы",
                                fontSize = 2.2.em)
                        }
                    }
                }
                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(15.dp),
                    colors = ButtonColors(containerColor = Color.DarkGray.copy(alpha = 0.2f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "icon",
                            tint = Color.White,
                            modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                        )

                        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.7f),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Bottom) {
                            Text(text = "Супермаркеты",
                                fontSize = 2.2.em)
                        }
                        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                            verticalAlignment = Alignment.Bottom) {
                            Text(text = "500.75 ₽",
                                fontSize = 3.em)
                        }

                    }
                }

                OutlinedButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(15.dp),
                    colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0.5f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {

                        Icon(

                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Card icon",
                            tint = Color.White,
                            modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                        )

                        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                            verticalAlignment = Alignment.Bottom) {

                            Text(text = "Здесь появятся траты по другим категориям",
                                fontSize = 2.2.em)
                        }
                    }
                }
            }
        }

        Row(modifier = Modifier.padding(top = 10.dp).background(color = Color.Gray,
            shape = RoundedCornerShape(20.dp)).height(50.dp).fillMaxWidth().clip(shape = RoundedCornerShape(20.dp)),) {

            Text(text = "Кредиты",
                fontSize = 5.em,
                modifier = Modifier.padding(10.dp).width(100.dp).fillMaxHeight())

            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "icon",
                tint = Color.White,
                modifier = Modifier.fillMaxHeight().width(50.dp)
            )
            Row(modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically){

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(5.dp),
                    colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.height(40.dp).width(40.dp)){

                    Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "icon",
                    tint = Color.Green,
                    modifier = Modifier.fillMaxSize())
                }
            }
        }

        Column(modifier = Modifier.padding(top = 10.dp).background(color = Color.Gray, shape = RoundedCornerShape(20.dp)).height(250.dp).fillMaxWidth().clip(shape = RoundedCornerShape(20.dp))) {

            Row(modifier = Modifier.fillMaxWidth().height(50.dp)) {

                Text(text = "Сервисы",
                    fontSize = 5.em,
                    modifier = Modifier.padding(10.dp))
            }

            Row(modifier = Modifier.fillMaxSize().padding(top = 10.dp, start = 10.dp, bottom = 10.dp).horizontalScroll(rememberScrollState())
            ) {

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(15.dp),
                    colors = ButtonColors(containerColor = Color.DarkGray.copy(alpha = 0.2f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {

                        Icon(
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Card icon",
                            tint = Color.Green,
                            modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                        )

                        Row(modifier = Modifier.fillMaxWidth().height(30.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Bottom) {
                            Text(text = "Оформить",
                                fontSize = 4.em)
                        }

                        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                            verticalAlignment = Alignment.Bottom) {
                            Text(text = "Карту, вклад, кредит и другое",
                                fontSize = 3.em)
                        }
                    }
                }

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(15.dp),
                    colors = ButtonColors(containerColor = Color.DarkGray.copy(alpha = 0.2f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {

                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Card icon",
                            tint = Color.Green,
                            modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                        )

                        Row(modifier = Modifier.fillMaxWidth().height(30.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Bottom) {
                            Text(text = "Мегамаркет",
                                fontSize = 4.em)
                        }

                        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                            verticalAlignment = Alignment.Bottom) {
                            Text(text = "Списать бонусы СберСпасибо",
                                fontSize = 3.em)
                        }
                    }
                }

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(15.dp),
                    colors = ButtonColors(containerColor = Color.DarkGray.copy(alpha = 0.2f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {

                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Card icon",
                            tint = Color.Green,
                            modifier = Modifier.fillMaxHeight(0.5f).fillMaxWidth(0.5f).align(Alignment.Start)
                        )

                        Row(modifier = Modifier.fillMaxWidth(0.8f).height(70.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Bottom) {

                            Text(text = "Все сервисы",
                                fontSize = 4.em)
                        }
                    }
                }
            }
        }

        Column(modifier = Modifier.padding(top = 10.dp).background(color = Color.Gray, shape = RoundedCornerShape(20.dp)).height(330.dp).fillMaxWidth().clip(shape = RoundedCornerShape(20.dp))) {

            Row(modifier = Modifier.fillMaxWidth().height(50.dp)) {

                Text(text = "Рекомендуем",
                    fontSize = 5.em,
                    modifier = Modifier.padding(10.dp))

                Row(modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.End) {

                    FilledTonalButton(onClick = { click() },
                        shape = RoundedCornerShape(20),
                        contentPadding = PaddingValues(5.dp),
                        colors = ButtonColors(containerColor = Color.Gray.copy(alpha = 0f),
                            contentColor = Color.White,
                            disabledContentColor = Color.Red,
                            disabledContainerColor = Color.Blue,),
                        modifier = Modifier.fillMaxHeight().width(70.dp)){

                        Text(text = "Все",
                            fontSize = 4.em,
                            color = Color.Green)
                    }
                }
            }

            Row(modifier = Modifier.fillMaxSize().padding(top = 10.dp, start = 10.dp, bottom = 10.dp).horizontalScroll(rememberScrollState())
            ) {

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonColors(containerColor = Color.DarkGray.copy(alpha = 0.2f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {

                        Row(modifier = Modifier.fillMaxWidth().height(150.dp).background(Color.Green,
                            shape = RoundedCornerShape(20.dp)
                        )){}

                        Row(modifier = Modifier.fillMaxWidth().height(60.dp).padding(15.dp, bottom = 0.dp, top = 15.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Top) {

                            Text(text = "Новогодняя распродажа",
                                fontSize = 3.em)
                        }

                        Row(modifier = Modifier.fillMaxWidth().height(70.dp).padding(15.dp, top = 0.dp),
                            verticalAlignment = Alignment.CenterVertically) {

                            Text(text = "Реклама ООО <<Маркетплейс>>",
                                fontSize = 2.em,
                                lineHeight = 1.5.em)
                        }
                    }
                }

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonColors(containerColor = Color.DarkGray.copy(alpha = 0.2f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {

                        Row(modifier = Modifier.fillMaxWidth().height(150.dp).background(Color.Yellow,
                            shape = RoundedCornerShape(20.dp)
                        )){}

                        Row(modifier = Modifier.fillMaxWidth().height(60.dp).padding(15.dp, bottom = 0.dp, top = 15.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Top) {

                            Text(text = "Классика осени",
                                fontSize = 3.em)
                        }

                        Row(modifier = Modifier.fillMaxWidth().height(70.dp).padding(15.dp, top = 0.dp),
                            verticalAlignment = Alignment.CenterVertically) {

                            Text(text = "Рекламодатель ООО <<Звук>>",
                                fontSize = 2.em,
                                lineHeight = 1.5.em)
                        }
                    }
                }

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonColors(containerColor = Color.DarkGray.copy(alpha = 0.2f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {

                        Row(modifier = Modifier.fillMaxWidth().height(150.dp).background(Color.Blue,
                            shape = RoundedCornerShape(20.dp)
                        )){}

                        Row(modifier = Modifier.fillMaxWidth().height(60.dp).padding(15.dp, bottom = 0.dp, top = 15.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Top) {

                            Text(text = "Скидка 500 ₽ на билеты",
                                fontSize = 3.em)
                        }

                        Row(modifier = Modifier.fillMaxWidth().height(70.dp).padding(15.dp, top = 0.dp),
                            verticalAlignment = Alignment.CenterVertically) {

                            Text(text = "Реклама ООО <<Компания Афиша>>",
                                fontSize = 2.em,
                                lineHeight = 1.5.em)
                        }
                    }
                }

                FilledTonalButton(onClick = { click() },
                    shape = RoundedCornerShape(20),
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonColors(containerColor = Color.DarkGray.copy(alpha = 0.2f),
                        contentColor = Color.White,
                        disabledContentColor = Color.Red,
                        disabledContainerColor = Color.Blue,),
                    modifier = Modifier.fillMaxHeight().width(160.dp).padding(start = 5.dp)) {

                    Column(modifier = Modifier.fillMaxSize()) {

                        Row(modifier = Modifier.fillMaxWidth().height(150.dp),
                            verticalAlignment = Alignment.Bottom,
                            horizontalArrangement = Arrangement.Center){

                            Icon(
                                imageVector = Icons.Default.KeyboardArrowRight,
                                contentDescription = "icon",
                                tint = Color.Gray,
                                modifier = Modifier.height(60.dp).width(60.dp).background(color = Color.DarkGray, shape = RoundedCornerShape(30.dp))
                            )
                        }

                        Row(modifier = Modifier.fillMaxWidth().height(60.dp).padding(15.dp, bottom = 0.dp, top = 15.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Top) {

                            Text(text = "Смотреть всё",
                                fontSize = 4.em)
                        }
                    }
                }
            }
        }
    }

    topMenu()
}

