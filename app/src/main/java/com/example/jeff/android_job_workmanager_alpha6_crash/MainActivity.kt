package com.example.jeff.android_job_workmanager_alpha6_crash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.evernote.android.job.JobManager

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    JobManager.create(this).addJobCreator(EvernoteJobCreator())

    MyJob.scheduleJob()
  }
}
