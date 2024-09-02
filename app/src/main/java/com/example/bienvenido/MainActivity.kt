package com.example.bienvenido

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFFD1E7D3)
            ) {
                ProfileCard()
            }
        }
    }
}

@Composable
fun ProfileCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.imagenandroid),
            contentDescription = "Android Logo",
            modifier = Modifier.size(130.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Marco Rios",
            fontSize = 40.sp,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = "Android Developer Extraordinaire",
            color = Color(0xFF4CAF50),
            fontSize = 15.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(100.dp))
        ContactInfo(icon = Icons.Default.Phone, contactText = "+11 (123) 946 307 375")
        Spacer(modifier = Modifier.height(8.dp))
        ContactInfo(icon = Icons.Default.Share, contactText = "@AndroidDev")
        Spacer(modifier = Modifier.height(8.dp))
        ContactInfo(icon = Icons.Default.Email, contactText = "marco.rios@android.com")
    }
}

@Composable
fun ContactInfo(icon: androidx.compose.ui.graphics.vector.ImageVector, contactText: String) {
    androidx.compose.foundation.layout.Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(icon, contentDescription = null, modifier = Modifier.size(24.dp))
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = contactText)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFD0E8D7)
    ) {
        ProfileCard()
    }
}

<<<<<<< HEAD
//Commit por Marco Rios
=======
//Comit por Antonio Rios
>>>>>>> c82282b217fb60d4d1de5b242ef4d01f98b0fb96
