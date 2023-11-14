package otus.gpb.homework.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import otus.gpb.homework.activities.ui.theme.ActivitiesTheme

class ActivityA : ComponentActivity(R.layout.activity_a) {
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val id=(applicationContext as App).id
        button=findViewById(R.id.openb)
    }

    override fun onStart() {
        super.onStart()
        button.onClickListener {

        }
    }
}
