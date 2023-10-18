package com.example.businesscardappd121211104

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardappd121211104.ui.theme.BusinessCardAppD121211104Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppD121211104Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardPreview()
                }
            }
        }
    }
}

@Composable
fun CardText(name: String, job: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.water_bg),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.foto_profil),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(175.dp)
                    .offset(y = (-240).dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = name,
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(7.dp)
                    .align(Alignment.CenterHorizontally)
                    .offset(x = (0).dp,y = (-240).dp),
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )
            Text(
                text = job,
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(y = (-240).dp),
                fontWeight = FontWeight.Bold
            )
        }
        ContactText(modifier = Modifier
            .align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun ContactText(modifier: Modifier = Modifier) {
    Column(modifier.padding(bottom = 300.dp, start = 0.dp)) {
        Row(modifier = Modifier
            .padding(7.dp))
        {
            Icon(
                Icons.Filled.Home,
                contentDescription = "Localized description",
                tint = Color.White,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "Indonesia",
                fontSize = 20.sp,
                color = Color.White,
                fontFamily = FontFamily.SansSerif
            )
        }
        Row(modifier = Modifier
            .padding(7.dp)) {
            Icon(
                Icons.Filled.Call,
                contentDescription = "Localized description",
                tint = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            )
            Text(
                text = "+6281342391294",
                fontSize = 20.sp,
                color = Color.White,
                fontFamily = FontFamily.SansSerif
            )
        }
        Row(modifier = Modifier
            .padding(7.dp))
        {
            Icon(
                Icons.Filled.Email,
                contentDescription = "Localized description",
                tint = Color.White,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "ikramarullahafif0@gmail.com",
                fontSize = 20.sp,
                color = Color.White,
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppD121211104Theme {
        CardText("Muhammad Ikram Arullahafif", "Informatics Engineering Student")
    }
}