package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.portfolio.ui.theme.PortfolioTheme



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val buttonSkills = findViewById<Button>(R.id.buttonSkills)

        buttonSkills.setOnClickListener {
            Toast.makeText(this, "Welcome to the skill intent!", Toast.LENGTH_SHORT).show()

            val skillsIntent = Intent(this, SkillsActivity::class.java)
            startActivity(skillsIntent)
        }

        val buttonProjects = findViewById<Button>(R.id.buttonProjects)
        buttonProjects.setOnClickListener {
            Toast.makeText(this, "Welcome to my projects!", Toast.LENGTH_SHORT).show()
            val projectIntent = Intent(this,projectsActivity::class.java)
            startActivity(projectIntent)
        }
    }
}


