package com.ahmetkaragunlu.cardapp

import android.content.res.Resources.Theme
import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmetkaragunlu.cardapp.ui.theme.CardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
              CardApp()
                }
            }
        }
    }
}




@Composable
fun CardApp() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFF3ddc84).copy(0.3F)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.android_logo)

        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .padding(16.dp)
                .height(120.dp)
                .background(Color.Blue)
        )

        Text(
            text = "Ahmet Karagünlü",
            style = TextStyle(fontSize = 45.sp)
        )
        Text(
            text = "Android Developer Extraordinaire",
            style = TextStyle(fontSize = 23.sp),
            color = Color(0xFF3ddc84)
        )
        Spacer(modifier = Modifier.height(300.dp))

        // Telefon numarası
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(end = 104.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.call),
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .padding(top = 6.dp),
                tint = Color(0xFF556B2F).copy(1F)
            )

            Text(
                text = "         0542 282 43 64",
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(4.dp)

            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        // E-posta adresi
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(end = 102.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.mail),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 45.dp)
                    .size(18.dp),
                tint = Color(0xFF556B2F).copy(1f)
            )


            Text(
                text = "@AndroidDev",
                style = TextStyle(fontSize = 14.sp),

                )
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Paylaşılacak e-posta adresi
        Row(


            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        )
        {
            Icon(
                painter = painterResource(id = R.drawable.share),
                contentDescription = null,
                modifier = Modifier.size(15.dp),
                tint = Color(0xFF556B2F).copy(1F)

            )

            Text(
                text = "      Ahmetkaragunlu67@gmail.com",
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(start = 16.dp)


            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun CardAppPreview() {
    CardAppTheme {
        CardApp()
    }
}




