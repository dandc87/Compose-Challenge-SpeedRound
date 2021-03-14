/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun WelcomeScreen() {
    Surface(
        color = MaterialTheme.colors.background,
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.light_welcome),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(all = 16.dp)
                    .fillMaxWidth(),
            ) {
                Text(
                    text = "MYSOOTH",
                    style = MaterialTheme.typography.h2,
                )
                Spacer(modifier = Modifier.requiredHeight(32.dp))
                Button(
                    modifier = Modifier
                        .requiredHeight(72.dp)
                        .fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium,
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "SIGN UP")
                }
                Spacer(modifier = Modifier.requiredHeight(8.dp))
                Button(
                    modifier = Modifier
                        .requiredHeight(72.dp)
                        .fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.secondary,
                    ),
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "LOG IN")
                }
            }
        }
    }
}

@Composable
@Preview("Light Theme", widthDp = 360, heightDp = 640)
fun Light_Preview_WelcomeScreen() {
    MyTheme(darkTheme = false) {
        WelcomeScreen()
    }
}

@Composable
@Preview("Dark Theme", widthDp = 360, heightDp = 640)
fun Dark_Preview_WelcomeScreen() {
    MyTheme(darkTheme = true) {
        WelcomeScreen()
    }
}
