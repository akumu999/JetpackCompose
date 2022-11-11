package com.bignerdranch.android.rabota1

import android.content.Intent
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.bignerdranch.android.rabota1.ui.theme.*

class CreateAlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rabota1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenColor
                ) {
                    Row(modifier = Modifier.offset(x = 20.dp, y = 20.dp)) {
                        GeneralActivity().TextView("Добавить будильник")

                    }
                    Row(modifier = Modifier.offset(x = 180.dp, y = 0.dp)) {
                        IconView2()
                    }
                    Row() {
                        Timeline()
                    }
                    Row() {
                        Text(text = "Повторять каждый", color = White, modifier = Modifier.offset(x =25.dp, y = 165.dp))
                    }
                    Row() {
                        CheckView()
                    }
                    Row(modifier = Modifier.offset(y=590.dp)) {
                        ButtonAdd6("Создать будильник")
                    }
                }
            }
        }
    }
}

@Composable
fun IconView2(){
    val context = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.back_button),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .offset(x = 150.dp, y = 15.dp)
            .size(50.dp).clickable(onClick={
                val intent = Intent(context, AlarmActivity::class.java)
                startActivity(context ,intent, null)})
    )
}

@Composable
fun ButtonAdd6(name: String) {
    val context = LocalContext.current
    Column (modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
    ) {
        Button(onClick = {val intent = Intent(context,GeneralActivity::class.java)
            startActivity(context,intent,null)},
            colors = ButtonDefaults.buttonColors(backgroundColor = LightGreen),
            modifier = Modifier
                .size(340.dp, 50.dp)
                .clip(RoundedCornerShape(20))
        ) {
            Text(
                text = name,
                color = MaterialTheme.colors.background,
                fontSize = 18.sp
            )
        }
    }
}


@Composable
fun Timeline(){
    var text2 by rememberSaveable { mutableStateOf("16:30") }
    var text3 by rememberSaveable { mutableStateOf("14.01.2021") }
    Row() {
        TextField(
            value = text2,
            onValueChange = {
                text2 = it
            }, modifier = Modifier
                .offset(x = 30.dp, y = 100.dp)
                .clip((RoundedCornerShape(20)))
                .size(150.dp, 50.dp)
                .background(White)
        )
        TextField(
            value = text3,
            onValueChange = {
                text3 = it
            }, modifier = Modifier
                .offset(x = 70.dp, y = 100.dp)
                .clip((RoundedCornerShape(20)))
                .size(150.dp, 50.dp)
                .background(White)
        )
    }
}

@Composable
fun CheckView(){
    val isChecked = remember { mutableStateOf(false) }
    val isChecked2 = remember { mutableStateOf(false) }
    val isChecked3 = remember { mutableStateOf(false) }
    val isChecked4 = remember { mutableStateOf(false) }
    val isChecked5 = remember { mutableStateOf(false) }
    val isChecked6 = remember { mutableStateOf(false) }
    val isChecked7 = remember { mutableStateOf(false) }
Column(modifier = Modifier.offset(x = 20.dp, y = 200.dp)) {
    Row (){
        Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it },enabled = true, modifier = Modifier
            .border(3.dp, Orange, RoundedCornerShape(0.dp))
            .background(White, RoundedCornerShape(0.dp))
            .size(21.dp, 21.dp))
        Text(text = "Понедельник", color = White,modifier = Modifier.offset(x = 10.dp))

    }
    Row (modifier = Modifier.offset(y = 10.dp)){
        Checkbox(checked = isChecked2.value, onCheckedChange = { isChecked2.value = it }, enabled = true
        , modifier = Modifier
                .border(3.dp, Orange, RoundedCornerShape(0.dp))
                .background(White, RoundedCornerShape(0.dp))
                .size(21.dp, 21.dp))
        Text(text = "Вторник", color = White,modifier = Modifier.offset(x = 10.dp))
    }
    Row(modifier = Modifier.offset(y = 20.dp)) {
        Checkbox(checked = isChecked3.value, onCheckedChange = { isChecked3.value = it }, enabled = true,modifier = Modifier
            .border(3.dp, Orange, RoundedCornerShape(0.dp))
            .background(White, RoundedCornerShape(0.dp))
            .size(21.dp, 21.dp))
        Text(text = "Среда",  color = White,modifier = Modifier.offset(x = 10.dp))
    }
    Row (modifier = Modifier.offset(y = 30.dp)){
        Checkbox(checked = isChecked4.value, onCheckedChange = { isChecked4.value = it }, enabled = true,modifier = Modifier
            .border(3.dp, Orange, RoundedCornerShape(0.dp))
            .background(White, RoundedCornerShape(0.dp))
            .size(21.dp, 21.dp))
        Text(text = "Четверг",  color = White,modifier = Modifier.offset(x = 10.dp))
    }
    Row (modifier = Modifier.offset(y = 40.dp)){
        Checkbox(checked = isChecked5.value, onCheckedChange = { isChecked5.value = it }, enabled = true,modifier = Modifier
            .border(3.dp, Orange, RoundedCornerShape(0.dp))
            .background(White, RoundedCornerShape(0.dp))
            .size(21.dp, 21.dp))
        Text(text = "Пятница",  color = White,modifier = Modifier.offset(x = 10.dp))
    }
    Row(modifier = Modifier.offset(y = 50.dp)) {
        Checkbox(checked = isChecked6.value, onCheckedChange = { isChecked6.value = it }, enabled = true,modifier = Modifier
            .border(3.dp, Orange, RoundedCornerShape(0.dp))
            .background(White, RoundedCornerShape(0.dp))
            .size(21.dp, 21.dp))
        Text(text = "Суббота",  color = White,modifier = Modifier.offset(x = 10.dp))
    }
    Row(modifier = Modifier.offset(y = 60.dp)) {
        Checkbox(checked = isChecked7.value, onCheckedChange = { isChecked7.value = it }, enabled = true,modifier = Modifier
            .border(3.dp, Orange, RoundedCornerShape(0.dp))
            .background(White, RoundedCornerShape(0.dp))
            .size(21.dp, 21.dp))
        Text(text = "Воскресенье", color = White, modifier = Modifier.offset(x = 10.dp))
    }
}


}

@Composable
fun Greeting7(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview7() {
    Rabota1Theme {
        Greeting7("Android")
    }
}