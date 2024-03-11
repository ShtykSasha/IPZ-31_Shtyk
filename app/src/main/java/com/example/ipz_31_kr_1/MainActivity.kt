package com.example.ipz_31_kr_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ipz_31_kr_1.ui.theme.IPZ31_KR1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ31_KR1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}
@Composable
fun GreetingCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Image",
                modifier = Modifier
                    .size(100.dp)

            )

            Text(
                text = "Shtyk Oleksandr",
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color =
                ),
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            Text(
                text = "Student",
                style = androidx.compose.ui.text.TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                ),
                modifier = Modifier
                    .padding(top = 20.dp)
            )

        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "image",
                    modifier = Modifier
                        .size(30.dp)

                )
                Text(
                    text = "+00 (00) 000 000"
                )
            }
            Row (
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "image",
                    modifier = Modifier
                        .size(30.dp)

                )
                Text(
                    text = "@socialmediahandle"
                )
            }
            Row (
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "image",
                    modifier = Modifier
                        .size(30.dp)

                )
                Text(
                    text = "email@domail.com"
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IPZ31_KR1Theme {
        GreetingCard()
    }
}